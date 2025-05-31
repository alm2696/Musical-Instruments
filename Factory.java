package instruments;

/**
 * Factory class to create instances of different types of musical instruments.
 * Provides a static method to create an instrument based on the given type.
 * 
 * @author angel
 */
public class Factory {

    /**
     * Creates a musical instrument instance based on the specified type.
     * 
     * @param type the type of instrument to create ("Violin", "Flute", "Drum")
     * @return an instance of a subclass of MusicalInstrument
     */
    public static Instruments createInstrument(String type) {
        switch (type) {
            case "Violin":
                return new StringInstrument("Violin", 4);  // Create a string instrument with 4 strings
            case "Flute":
                return new WindInstrument("Flute", "Blowhole");  // Create a wind instrument with a blowhole mouthpiece
            case "Drum":
                return new PercussionInstrument("Drum", "Wood");  // Create a percussion instrument made of wood
            case "Guitar":
                return new StringInstrument("Guitar", 6);  // Create a string instrument with 6 strings
            case "Saxophone":
                return new WindInstrument("Saxophone", "Reed");  // Create a wind instrument with a reed mouthpiece
            default:
                throw new IllegalArgumentException("Unknown instrument type: " + type);
        }
    }
}
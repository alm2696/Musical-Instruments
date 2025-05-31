package instruments;

/**
 * Abstract class representing a generic musical instrument.
 * Contains properties like name and family, and an abstract method to get the description.
 * 
 * @author angel
 */
public abstract class Instruments {
    protected String name;  // Name of the instrument
    protected String family;  // Type of the instrument

    /**
     * Constructor for a musical instrument.
     * 
     * @param name   the name of the instrument
     * @param family the family of the instrument (String, Wind, Percussion)
     */
    public Instruments(String name, String family) {
        this.name = name;
        this.family = family;
    }

    /**
     * Abstract method to get the description of the instrument.
     * Each subclass should provide its own implementation of this method.
     * 
     * @return a formatted string containing the instrument's details
     */
    public abstract String getDescription();
}

// Child 1: StringInstrument
/**
 * Represents a string instrument, which is a subclass of MusicalInstrument.
 * Contains additional information like the number of strings.
 */
class StringInstrument extends Instruments {
    private int numberOfStrings;  // Number of strings on the instrument

    /**
     * Constructor for a string instrument.
     * 
     * @param name            the name of the string instrument
     * @param numberOfStrings the number of strings the instrument has
     */
    public StringInstrument(String name, int numberOfStrings) {
        super(name, "String");  // Call to superclass constructor with "String" family
        this.numberOfStrings = numberOfStrings;
    }

    /**
     * Returns a description of the string instrument, including its number of strings.
     * 
     * @return a formatted string with the instrument's name, family, and number of strings
     */
    @Override
    public String getDescription() {
        return String.format("Instrument: %s\nFamily: %s\nNumber of Strings: %d", name, family, numberOfStrings);
    }
}

// Child 2: WindInstrument
/**
 * Represents a wind instrument, which is a subclass of MusicalInstrument.
 * Contains additional information like the type of mouthpiece.
 */
class WindInstrument extends Instruments {
    private String mouthpieceType;  // Type of mouthpiece the instrument uses

    /**
     * Constructor for a wind instrument.
     * 
     * @param name           the name of the wind instrument
     * @param mouthpieceType the type of mouthpiece the instrument has
     */
    public WindInstrument(String name, String mouthpieceType) {
        super(name, "Wind");  // Call to superclass constructor with "Wind" family
        this.mouthpieceType = mouthpieceType;
    }

    /**
     * Returns a description of the wind instrument, including its mouthpiece type.
     * 
     * @return a formatted string with the instrument's name, family, and mouthpiece type
     */
    @Override
    public String getDescription() {
        return String.format("Instrument: %s\nFamily: %s\nMouthpiece Type: %s", name, family, mouthpieceType);
    }
}

// Child 3: PercussionInstrument
/**
 * Represents a percussion instrument, which is a subclass of MusicalInstrument.
 * Contains additional information like the material used.
 */
class PercussionInstrument extends Instruments {
    private String material;  // Material the instrument is made of

    /**
     * Constructor for a percussion instrument.
     * 
     * @param name     the name of the percussion instrument
     * @param material the material the instrument is made of
     */
    public PercussionInstrument(String name, String material) {
        super(name, "Percussion");  // Call to superclass constructor with "Percussion" family
        this.material = material;
    }

    /**
     * Returns a description of the percussion instrument, including its material.
     * 
     * @return a formatted string with the instrument's name, family, and material
     */
    @Override
    public String getDescription() {
        return String.format("Instrument: %s\nFamily: %s\nMaterial: %s", name, family, material);
    }
}
/**
 * This module definition file defines the module for the application.
 * It specifies the required JavaFX modules and exports the 'instruments' package
 * so that it can be used by other parts of the application.
 * 
 * @author angel
 */
module edu.commonwealthu.alm2696.CMSC230 {
    // Requires JavaFX modules for creating graphical applications
    requires javafx.graphics;
    requires javafx.controls;
    
    // Exports the 'instruments' package, allowing other modules to access it
    exports instruments;
}

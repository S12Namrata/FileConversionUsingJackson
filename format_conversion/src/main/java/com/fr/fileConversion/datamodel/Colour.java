package com.fr.fileConversion.datamodel;


/**
 * The Enum Colour.
 *
 */
public enum Colour {
	
	/** The red. */
	R("R"), 
    
    /** The green. */
    G("G"),
    
    /** The blue. */
    B("B");

    /** The name. */
    private String name;

    /**
	 * Instantiates a new colour.
	 *
	 * @param name the name
	 */
    private Colour(String name) {
        this.name = name;
    }

    /**
	 * Gets the name.
	 *
	 * @return the name
	 */
    public String getName() {
        return name;
    }
}

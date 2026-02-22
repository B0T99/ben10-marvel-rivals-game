package com.ben10.rivals.model;

public class Character {
    private String name;
    private String type;

    private Character(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public static Character createCharacter(String characterType) {
        switch (characterType.toLowerCase()) {
            case "hero":
                return new Character("Hero Name", "Hero");
            case "villain":
                return new Character("Villain Name", "Villain");
            // Add other character types and names as needed.
            default:
                throw new IllegalArgumentException("Character type not recognized");
        }
    }
}
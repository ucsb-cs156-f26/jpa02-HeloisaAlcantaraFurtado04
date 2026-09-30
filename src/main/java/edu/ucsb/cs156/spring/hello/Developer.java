package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
       
        return "Heloisa";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        
        return "HeloisaAlcantaraFurtado04";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        
        Team team = new Team("f26-14");
        team.addMember("Aylin");
        team.addMember("Krithi");
        team.addMember("Heloisa");
        team.addMember("Ray");
        team.addMember("Ryan");
        team.addMember("Vishwath");
        return team;
    }
}

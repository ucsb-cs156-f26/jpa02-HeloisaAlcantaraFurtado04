package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
      @Test 
    public void getTeam_returns_team_with_correct_name(){
        Team t =Developer.getTeam(); 
        assertTrue(t.getMembers().contains("Aylin"),"Team should contain Aylin");
        assertTrue(t.getMembers().contains("Krithi"),"Team should contain Krithi");
        assertTrue(t.getMembers().contains("Heloisa"),"Team should contain Heloisa");
        assertTrue(t.getMembers().contains("Ray"),"Team should contain Ray");
        assertTrue(t.getMembers().contains("Ryan"),"Team should contain Ryan");
        assertTrue(t.getMembers().contains("Vishwath"),"Team should contain Vishwath");

    }

}

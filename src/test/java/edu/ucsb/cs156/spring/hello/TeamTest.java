package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
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

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }
    @Test
    public void equals_same_object() {
    assertEquals(team, team);
    }

    @Test
    public void equals_different_class() {
    assertTrue(!team.equals("test-team"));
    }

    @Test
    public void equals_same_name_same_members() {
    Team other = new Team("test-team");
    assertEquals(team, other);
    }

    @Test
    public void equals_same_name_different_members() {
    Team other = new Team("test-team");
    other.addMember("member");
    assertTrue(!team.equals(other));
}

    @Test
    public void equals_different_name() {
    Team other = new Team("different-team");
    assertTrue(!team.equals(other));
    }

    @Test
    public void hashCode_same_content() {
    Team t1 = new Team("foo");
    t1.addMember("bar");

    Team t2 = new Team("foo");
    t2.addMember("bar");

    assertEquals(t1.hashCode(), t2.hashCode());
    }
    @Test
    public void hashCode_returns_expected_value() {
    Team t = new Team("foo");
    t.addMember("bar");

    int result = t.hashCode();
    int expectedResult =130294; 

    assertEquals(expectedResult, result);
}

    }

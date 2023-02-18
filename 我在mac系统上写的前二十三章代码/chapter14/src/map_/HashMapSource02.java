package map_;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author 王凯
 * @version 1.0
 */
public class HashMapSource02 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        for (int i = 1; i <=12 ; i++) {
            hashMap.put(i,i);
        }

        hashMap.put(13,"haden");

    }
}
class Team{
    private String teamName;
    private String name;

    public Team(String teamName, String name) {
        this.teamName = teamName;
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(teamName, team.teamName) && Objects.equals(name, team.name);
    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(teamName);
//    }


    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

package my.algorithm.programmers;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class SkillTree {
	
	public int solution(String skill, String[] skill_trees) {
        Boolean[] possibleSkills = new Boolean[skill_trees.length];
        
        for (int i = 0; i < skill_trees.length; i++) {
            StringBuilder sb = new StringBuilder();
            String thisSkill = skill_trees[i];
            for (int j = 0; j < thisSkill.length(); j++) {
                String key = "" + thisSkill.charAt(j);
                if (skill.contains(key)) {
                    sb.append(key);
                }
            }  
            if (skill.startsWith(sb.toString())) possibleSkills[i] = true;
        }

        return (int) Arrays.stream(possibleSkills)
        		.filter(bool -> bool != null && bool == true)
        		.count();
    }
	
	@Test
	public void test() {
		assertEquals(solution("CBD", new String[] { "BACDE", "CBADF", "AECB", "BDA" }), 2);
	}
}

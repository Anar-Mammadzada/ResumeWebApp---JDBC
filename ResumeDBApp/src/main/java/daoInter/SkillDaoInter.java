/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoInter;

import entity.Skill;
import java.util.List;

/**
 *
 * @author Anar
 */
public interface SkillDaoInter {

    public List<Skill> getAllSkill();

    public boolean insertSkill(Skill skl);

}

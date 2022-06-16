/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoInter;

import entity.UserSkill;
import java.util.List;

/**
 *
 * @author Anar
 */
public interface UserSkillDaoInter {

    public List<UserSkill> getAllSkillByUserId(int userId);

    public boolean removeUserSkill(int id);

    public boolean insertUserSkill(UserSkill us);

    public boolean updateUserSkill(UserSkill us);
}

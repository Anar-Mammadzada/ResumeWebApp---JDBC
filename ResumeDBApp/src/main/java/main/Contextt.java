/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import daoImpl.CountryDaoImpl;
import daoImpl.EmploymentHistoryDaoImpl;
import daoImpl.SkillDaoImpl;
import daoImpl.UserDaoImpl;
import daoImpl.UserSkillDaoImpl;
import daoInter.CountryDaoInter;
import daoInter.EmploymentHistoryDaoInter;
import daoInter.SkillDaoInter;
import daoInter.UserDaoInter;
import daoInter.UserSkillDaoInter;

/**
 *
 * @author Anar
 */
public class Contextt {
    public static UserDaoInter instanceUserDao(){
        return new UserDaoImpl();
    }
    
    public static UserSkillDaoInter instanceUserSkillDao(){
        return new UserSkillDaoImpl();
    }
    
    public static EmploymentHistoryDaoInter instanceEmploymentDao(){
        return new EmploymentHistoryDaoImpl();
    }
    
    public static CountryDaoInter instanceCountryDao(){
        return new CountryDaoImpl();
    }
    
    public static SkillDaoInter instanceSkillDao(){
        return new SkillDaoImpl();
    }

}

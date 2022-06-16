/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImpl;

import daoInter.AbstractDao;
import daoInter.SkillDaoInter;
import entity.Skill;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anar
 */
public class SkillDaoImpl extends AbstractDao implements SkillDaoInter{
    
     @Override
    public List<Skill> getAllSkill() {
        List<Skill> result = new ArrayList<>();
        try(Connection c = connect()){
            Statement stmt = c.createStatement();
            stmt.execute("select * from skill");
            ResultSet rs = stmt.getResultSet();
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                result.add(new Skill(id,name));
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return result;
    }
    
    @Override
    public boolean insertSkill(Skill skl) {
        try(Connection c = connect()){
            PreparedStatement stmt = c.prepareStatement("insert into skill(name) values(?)",Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, skl.getName());
            stmt.execute();
            ResultSet generatedKeys = stmt.getGeneratedKeys();
                if(generatedKeys.next()){
                    skl.setId(generatedKeys.getInt(1));
                } 
            }catch(Exception ex){
        }
        return false;
    }


}

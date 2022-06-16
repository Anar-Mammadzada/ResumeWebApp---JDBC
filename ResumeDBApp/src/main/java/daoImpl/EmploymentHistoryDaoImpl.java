/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImpl;

import daoInter.AbstractDao;
import daoInter.EmploymentHistoryDaoInter;
import entity.EmploymentHistory;
import entity.User;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anar
 */
public class EmploymentHistoryDaoImpl extends AbstractDao implements EmploymentHistoryDaoInter{
    
    @Override
    public List<EmploymentHistory> getAllHistoryByUserId(int userId) {
        List<EmploymentHistory> result = new ArrayList<>();
        try(Connection c = connect()){
            PreparedStatement stmt = c.prepareStatement("select * from employment_history where id =?");
            stmt.setInt(1, userId);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();
            while(rs.next()){
                EmploymentHistory emp = getEmploymentHistory(rs);
                result.add(emp);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return result;
    }
    
    private EmploymentHistory getEmploymentHistory(ResultSet rs)throws Exception{
        String header = rs.getString("header");
        Date beginDate = rs.getDate("begin_date");
        Date endDate = rs.getDate("end_date");
        String jobDescription = rs.getString("job_description");
        int userId = rs.getInt("user_id");
        return new EmploymentHistory(null, header, beginDate, endDate, jobDescription, new User(userId));
    }

}

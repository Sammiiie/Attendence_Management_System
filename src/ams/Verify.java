/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ams;

import com.machinezoo.sourceafis.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.List;
import sun.misc.Cache;
/**
 *
 * @author Ejiga Samuel
 */
public class Verify {
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    class UserDetails{
        int id;
        String name;
        FingerprintTemplate template;
    }
    
    interface UserRepository{
        List<UserDetails> retrieveUsers();
    }
    
    class CachingUserRepository implements UserRepository {
//        try{
//            conn = Connection1.connectDB();
//            String sql = "select * from student";
//            pst = conn.prepareStatement(sql);
//            rs = pst.executeQuery();
//            UserDetails(rs);
//        }
//        catch(SQLExeception e){
//        }
        private Cache cache;
        private UserRepository delegate;
        
        
        public List<UserDetails> retrieveUsers(){
            List<UserDetails> result = (List<UserDetails>) cache.get(rs);
            if (rs == null){
                rs = (ResultSet) delegate.retrieveUsers();
            }
            return (List<UserDetails>) rs;
        }
    }
    
    UserDetails find(FingerprintTemplate probe, Iterable<UserDetails> candidates){
        FingerprintMatcher matcher = new FingerprintMatcher().index(probe);
        UserDetails match = null;
        double high = 0;
        for (UserDetails candidate : candidates){
            double score = matcher.match(candidate.template);
            if (score > high){
                high = score;
                match = candidate;
            }
        }
        double threshold = 40;
        return high >= threshold ? match : null;
    }
}

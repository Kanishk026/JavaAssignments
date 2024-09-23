package com.login.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.login.entity.Login;
import com.login.repo.Repo;

public class Main {

    public static void main(String[] args) {

        Repo ops = new Repo();
      
        // 1. Add user
        Login newUser = new Login("Kanishk", "123");
        Login newUser1 = new Login("Kanishk V", "12345678");

        ops.addUser(newUser);
        System.out.println("User added successfully.");

        // 2. Validate user
        Login loginAttempt = new Login("Kanishk", "123");
        boolean isValidUser = ops.validateUser(loginAttempt);
        System.out.println("User validation result: " + isValidUser);

        // 3. Remove user
        ops.removeUser(newUser);
        System.out.println("User removed successfully.");
        
        // 4. Sign out user
        boolean signedOut = ops.signOut(newUser);
        System.out.println("User sign-out result: " + signedOut);
    }
}
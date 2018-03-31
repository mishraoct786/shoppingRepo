package org.mishra.com.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class MyEncoder {
public static void main(String args [])
{
	BCryptPasswordEncoder encoder =new BCryptPasswordEncoder(12);
	String var = encoder.encode("admin");
	System.out.println(var);
}
}

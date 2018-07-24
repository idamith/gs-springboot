package com.idotrick.gssb.user.model;

import java.util.HashMap;
import java.util.Map;

public enum EUserType {
	Admin(0), User(1);
	
	private int id;
    private static final Map<Integer, EUserType> lookup = new HashMap<>();	
    
    static {
        for (EUserType t : EUserType.values()) {
            lookup.put(t.getId(), t);
        }
    }    
	
	private EUserType(){}
	
	private EUserType(Integer id) {
		this.id=id;
	}
	
	public Integer getId() {
		return this.id;
	}
    
    public static EUserType get(Integer id) {
        return lookup.get(id);
    }
}

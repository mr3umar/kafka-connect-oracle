package com.ecer.kafka.connect.oracle.models;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  
 * @author Erdem Cer (erdemcer@gmail.com)
 */

public class Data{

    private long scn;
    private String segOwner;
    private String segName;
    private String sqlRedo;
    private Timestamp timeStamp;
    private String operation;

    public Data(Long scn,String segOwner,String segName,String sqlRedo,Timestamp timeStamp,String operation){
        super();
        this.scn=scn;
        this.segOwner=segOwner;
        this.segName=segName;
        this.sqlRedo=sqlRedo;
        this.timeStamp=timeStamp;
        this.operation=operation;
    }

    public long getScn(){
        return scn;
    }

    public String getSegOwner(){
        return segOwner;
    }

    public String getSegName(){
        return segName;
    }

    public String getSqlRedo(){
        return sqlRedo;
    }

    public Timestamp getTimeStamp(){
        return new Timestamp(System.currentTimeMillis());

        // return timeStamp;
    }

    public String getDateFormatted(){
        Date d = new Date(timeStamp.getTime());
        DateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //yyyy-MM-dd HH:mm:ss.SSS
        return f.format(d);
    }

    public String getOperation(){
        return operation;
    }

    public void setScn(Long scn){
        this.scn=scn;
    }

    public void setSegOwner(String segOwner){
        this.segOwner=segOwner;
    }

    public void setSegName(String segName){
        this.segName=segName;
    }

    public void setSqlRedo(String sqlRedo){
        this.sqlRedo=sqlRedo;
    }

    public void setTimeStamp(Timestamp timeStamp){
        this.timeStamp=timeStamp;
    }

    public void setOperation(String operation){
        this.operation=operation;
    }
}
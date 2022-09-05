package academic.model;

/**
 * @author 12S20003 Marcel Joshua
 */

public class Student {

    public String id;
    public String stuName;
    public float ipk;
    public int sks;

    public Student ( )
    {
        id      = "";
        stuName = "";
        ipk     =  0;
        sks     =  0;
    }

    public Student ( String ID, String STU_NAME, float IPK, int SKS )
    {
        id      = ID;
        ipk     = IPK;
        sks     = SKS;
        stuName = STU_NAME;
    }

    // accessor dan mutator untuk id
    public String getId ( ) { return id; }
    public void   setId ( String ID ) { id = ID; }

    // accessor dan mutator untuk stuName
    public String getStuName ( ) { return stuName; }
    public void   setStuName ( String STU_NAME ) { stuName = STU_NAME; }

    // accessor dan mutator untuk ipk
    public float getIpk ( ) { return ipk; }
    public void  setIpk ( float IPK ) { ipk = IPK; }

    // accessor dan mutator untuk sks
    public int  getSks ( ) { return sks; }
    public void setSks ( int SKS ) { sks = SKS; }

    public String toString ( )
    { return String.format( "%s|%s|%.2f|%d", id, stuName, ipk, sks ); }

}
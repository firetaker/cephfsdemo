package cephfsdemo;

import java.io.FileNotFoundException;

import com.ceph.fs.CephMount;

public class cephfsjava {
    
	public static void main(String[] args) throws FileNotFoundException {
		
		CephMount fsmount = new CephMount();
		String conf_file = System.getProperty("/etc/ceph/ceph.conf");
	    if (conf_file != null)
	    	fsmount.conf_read_file(conf_file);
        fsmount.mount("/mnt/xxx");
        fsmount.mkdir("12345", 0777);
	}

}

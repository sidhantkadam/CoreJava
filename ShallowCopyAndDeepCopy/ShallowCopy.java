package ShallowCopyAndDeepCopy;

    /*
        A shallow copy creates a new object and then copies the primitive field values from
        the original object to the new one. However, instead of creating new copies of nested
        objects, it copies their references. This means both the original and the copied
        object will point to the same nested objects in memory. If you modify a nested object
        through either the original or the copied object, the changes will be visible in both.
        The clone() method in Java's Object class performs a shallow copy by default.
        *using default clone() method*
    */

import java.util.ArrayList;
import java.util.List;

class NetworkConnection implements Cloneable {
    private String ipAddress;
    private String impData;
    private List<String> domains = new ArrayList<>();

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getImpData() {
        return impData;
    }

    public void setImpData(String impData) {
        this.impData = impData;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public void addDomains() {
        domains.add("www.l1.com");
        domains.add("www.l2.org.in");
        domains.add("www.l3.in");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "NetworkConnection : " +
                "ipAddress='" + ipAddress + '\'' +
                ", impData='" + impData + '\'' +
                ", domains=" + domains;
    }
}

public class ShallowCopy {
    public static void main(String[] args) {
        NetworkConnection connection = new NetworkConnection();
        connection.setImpData("Imp1");
        connection.setIpAddress("192.63.47.80");
        connection.addDomains();

        try {
            NetworkConnection connection1 = (NetworkConnection) connection.clone();
            NetworkConnection connection2 = (NetworkConnection) connection.clone();

            System.out.println(connection);
            System.out.println(connection1);
            System.out.println(connection2);

            connection.getDomains().remove(0);

            System.out.println("**************");
            System.out.println(connection);
            System.out.println(connection1);
            System.out.println(connection2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

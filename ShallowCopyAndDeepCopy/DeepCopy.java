package ShallowCopyAndDeepCopy;

import java.util.ArrayList;
import java.util.List;

    /*
        A deep copy creates a new object and recursively copies all the fields, including the
        nested objects. This means that a completely independent duplicate of the original
        object is created. Any changes made to the nested objects in the copied object will
        not affect the original object, as they point to different memory locations. To
        perform a deep copy, you must implement custom logic, such as overriding the clone()
        method to manually clone each nested object or using serialization.
        *using Customized clone() method*
    */

class NetworkConnection1 implements Cloneable {
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
        NetworkConnection1 connection = new NetworkConnection1();
        connection.setIpAddress(this.ipAddress);
        connection.setImpData(this.impData);

        for (String s : this.getDomains()) {
            connection.getDomains().add(s);
        }
        return connection;
    }

    @Override
    public String toString() {
        return "NetworkConnection : " +
                "ipAddress='" + ipAddress + '\'' +
                ", impData='" + impData + '\'' +
                ", domains=" + domains;
    }
}

public class DeepCopy {
    public static void main(String[] args) {
        NetworkConnection1 connection = new NetworkConnection1();
        connection.setImpData("Imp1");
        connection.setIpAddress("192.30.20.18");
        connection.addDomains();

        try {
            NetworkConnection1 connection2 = (NetworkConnection1) connection.clone();
            NetworkConnection1 connection3 = (NetworkConnection1) connection.clone();

            System.out.println(connection);
            System.out.println(connection2);
            System.out.println(connection3);

            connection2.getDomains().remove(0);
            connection3.getDomains().remove(1);
            System.out.println("***********");

            System.out.println(connection);
            System.out.println(connection2);
            System.out.println(connection3);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

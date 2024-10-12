package org.example;

public class Address implements Comparable<Address> {
    private String streeName;
    private int pincode;

    public Address(String streeName, int pincode) {
        this.streeName = streeName;
        this.pincode = pincode;
    }

    public String getStreeName() {
        return streeName;
    }

    public void setStreeName(String streeName) {
        this.streeName = streeName;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public int compareTo(Address o) {
        return this.getPincode() - o.getPincode();
    }

    @Override
    public String toString() {
        return "Address{" +
                "streeName='" + streeName + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}

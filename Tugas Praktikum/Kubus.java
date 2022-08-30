public class Kubus {
    int sisiKubus = 5;

    public Double hitungVolume() {
        Double volume = (double) (sisiKubus * sisiKubus * sisiKubus);
        return volume;
    }

    public int hitungLuasPermukaan() {
        int luasPermukaan = 6 * sisiKubus * sisiKubus;
        return luasPermukaan;
    }

    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        System.out.println("Volume kubus : "+kubus.hitungVolume());
        System.out.println("Luas permukaan kubus : "+kubus.hitungLuasPermukaan());
    }
}

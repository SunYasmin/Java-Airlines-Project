package airlines;

public class Passenger {
    String city;
    int flyType;
    int age;
    double price = 1.0;

    @Override
    public String toString() {
        return "Passenger{" +
                "city='" + city + '\'' +
                ", flytype='" + flyType + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }

    public Passenger(String city, int flyType, int age, double price) {
        this.city = city;
        this.flyType = flyType;
        this.age = age;
        this.price = price;
    }

    public void takeTicket(){

        double priceB = 0.10 * 500;
        double priceC = 0.10 * 700;
        double priceD = 0.10 * 900;

        switch (city) {
            case "B":
                System.out.println("Uçuşunuz için Bilet tutarınız : "
                        + (forAgePrice(price) * priceB * forFlyTypePrice(flyType)) + "$");

                break;
            case "C":
                System.out.println("Uçuşunuz için Bilet tutarınız : "
                        + (forAgePrice(price) * priceC * forFlyTypePrice(flyType)) + "$");
                break;
            case "D":
                System.out.println("Uçuşunuz için Bilet tutarınız : "
                        + (forAgePrice(price) * priceD * forFlyTypePrice(flyType)) + "$");
                break;

            }
        }


        public double forAgePrice(double price) {

            if (age > 65) {
                price *= 0.7;
            } else if (age >= 12 && age < 24) {
                price *= 0.9;
            } else if (age < 12) {
                price *= 0.5;

            } else if (age >= 24 && age <= 65) {
                price *= 1.0;
            }
            return price;
        }

        public double forFlyTypePrice(int flyType) {
            if (flyType == 1) {
                price*=1.0;

            } else if (flyType == 2) {
                price =(price*0.8)*2;
            }
            return price;
        }

    }

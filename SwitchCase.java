import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a fruit name:");
        String fruit=s.nextLine();
        switch (fruit) {
            case "apple":
                System.out.println("Apples One of the most popular fruits," +
                        " apples are chock-full of nutrition." +
                        " They’re rich in both soluble and insoluble fiber, such as pectin, hemicellulose, and cellulose." +
                        " These help you manage your blood sugar levels, promote good digestion, and support gut and heart health. ");
                break;
            case "banana":
                System.out.println("The benefits of bananas go beyond their potassium content." +
                        " Along with providing 7% of the Daily Value (DV) for potassium, bananas contain (15Trusted Source):\n" +
                        "\n" +
                        "Vitamin B6: 27% of the DV\n" +
                        "Vitamin C: 12% of the DV\n" +
                        "Magnesium: 8% of the DV\n");
                break;
            case "orange":
                System.out.println("Oranges are known for their high vitamin C content, providing 91% of the DV in a single fruit." +
                        " They’re also high in potassium, folate, thiamine (vitamin B1), fiber, and plant polyphenols (24Trusted Source).\n" +
                        "\n" +
                        "Studies have found that consuming whole oranges may lower levels of inflammation, blood pressure, cholesterol, and post-meal blood sugar.");
                break;
            case "mango":
                System.out.println("Known as the “king of fruits,” mangoes are an excellent source of potassium, folate, fiber, and vitamins A, C, B6, E, and K. " +
                        "They’re also rich in numerous plant polyphenols that have antioxidant and anti-inflammatory properties");
                break;
            case "watermelon":
                System.out.println("Watermelon is a highly nutritious summer favorite. " +
                        "It’s an abundant source of antioxidants, such as vitamins A and C, beta carotene, and lycopene." +
                        " It’s also a good source of potassium and magnesium");
                break;
            case "guava":
                System.out.println("Guava is a fantastic source of vitamin C. In fact, a single fruit (55 grams) provides 140% of the DV for this nutrient");
                break;
            case "grapes":
                System.out.println("Grapes are convenient, healthy, and particularly high in potassium and vitamin K, which both support heart health.\n" +
                        "\n" +
                        "They’re a rich source of beneficial plant compounds that have been linked to numerous health benefits, such as a lowered risk of heart disease and certain types of cancer. These compounds include" +
                        "resveratrol\n" +
                        "anthocyanins\n" +
                        "caffeic acid\n" +
                        "quercetin\n" +
                        "kaempferol");
                break;
            case "pomegranates":
                System.out.println("Pomegranates are known for their high antioxidant content.\n" +
                        "\n" +
                        "They contain a lengthy list of beneficial plant compounds, such as flavonoids, tannins, and lignans. " +
                        "These have strong antioxidant and anti-inflammatory properties that help fight free radicals and reduce your risk of chronic disease");
                break;
        }

    }

}

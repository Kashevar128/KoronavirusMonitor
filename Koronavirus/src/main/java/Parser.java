import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    private static Document getPage(int n) throws IOException {
        String url = null;
        switch (n) {
            case 0:
                url = "https://coronavirusstat.ru/country/moskva/";
                break;
            case 1:
                url = "https://coronavirusstat.ru/country/moskovskaya_oblast/";
                break;
            case 2:
                url = "https://coronavirusstat.ru/country/sankt_peterburg/";
                break;
            case 3:
                url = "https://coronavirusstat.ru/country/nizhegorodskaya_oblast/";
                break;
            case 4:
                url = "https://coronavirusstat.ru/country/respublika_dagestan/";
                break;
            case 5:
                url = "https://coronavirusstat.ru/country/murmanskaya_oblast/";
                break;
            case 6:
                url = "https://coronavirusstat.ru/country/krasnodarskiy_kray/";
                break;
            case 7:
                url = "https://coronavirusstat.ru/country/tulskaya_oblast/";
                break;
            case 8:
                url = "https://coronavirusstat.ru/country/rostovskaya_oblast/";
                break;
            case 9:
                url = "https://coronavirusstat.ru/country/bryanskaya_oblast/";
                break;
            case 10:
                url = "https://coronavirusstat.ru/country/kaluzhskaya_oblast/";
                break;
            case 11:
                url = "https://coronavirusstat.ru/country/sverdlovskaya_oblast/";
                break;
            case 12:
                url = "https://coronavirusstat.ru/country/ryazanskaya_oblast/";
                break;
            case 13:
                url = "https://coronavirusstat.ru/country/leningradskaya_oblast/";
                break;
            case 14:
                url = "https://coronavirusstat.ru/country/respublika_tatarstan/";
                break;
            case 15:
                url = "https://coronavirusstat.ru/country/respublika_bashkortostan/";
                break;
            case 16:
                url = "https://coronavirusstat.ru/country/respublika_severnaya_osetiya_alaniya/";
                break;
            case 17:
                url = "https://coronavirusstat.ru/country/kurskaya_oblast/";
                break;
            case 18:
                url = "https://coronavirusstat.ru/country/respublika_ingushetiya/";
                break;
            case 19:
                url = "https://coronavirusstat.ru/country/vladimirskaya_oblast/";
                break;
            case 20:
                url = "https://coronavirusstat.ru/country/respublika_mordoviya/";
                break;
            case 21:
                url = "https://coronavirusstat.ru/country/tambovskaya_oblast/";
                break;
            case 22:
                url = "https://coronavirusstat.ru/country/krasnoyarskiy_kray/";
                break;
            case 23:
                url = "https://coronavirusstat.ru/country/respublika_chuvashiya/";
                break;
            case 24:
                url = "https://coronavirusstat.ru/country/stavropolskiy_kray/";
                break;
            case 25:
                url = "https://coronavirusstat.ru/country/yaroslavskaya_oblast/";
                break;
            case 26:
                url = "https://coronavirusstat.ru/country/respublika_komi/";
                break;
            case 27:
                url = "https://coronavirusstat.ru/country/respublika_mariy_el/";
                break;
            case 28:
                url = "https://coronavirusstat.ru/country/orlovskaya_oblast/";
                break;
            case 29:
                url = "https://coronavirusstat.ru/country/tverskaya_oblast/";
                break;
            case 30:
                url = "https://coronavirusstat.ru/country/kabardino_balkarskaya_respublika/";
                break;
            case 31:
                url = "https://coronavirusstat.ru/country/chelyabinskaya_oblast/";
                break;
            case 32:
                url = "https://coronavirusstat.ru/country/khabarovskiy_kray/";
                break;
            case 33:
                url = "https://coronavirusstat.ru/country/novosibirskaya_oblast/";
                break;
            case 34:
                url = "https://coronavirusstat.ru/country/orenburgskaya_oblast/";
                break;
            case 35:
                url = "https://coronavirusstat.ru/country/yamalo_nenetskiy_avtonomnyy_okrug/";
                break;
            case 36:
                url = "https://coronavirusstat.ru/country/voronezhskaya_oblast/";
                break;
            case 37:
                url = "https://coronavirusstat.ru/country/permskiy_kray/";
                break;
            case 38:
                url = "https://coronavirusstat.ru/country/kirovskaya_oblast/";
                break;
            case 39:
                url = "https://coronavirusstat.ru/country/saratovskaya_oblast/";
                break;
            case 40:
                url = "https://coronavirusstat.ru/country/chechenskaya_respublika/";
                break;
            case 41:
                url = "https://coronavirusstat.ru/country/chechenskaya_respublika/";
                break;
            case 42:
                url = "https://coronavirusstat.ru/country/samarskaya_oblast/";
                break;
            case 43:
                url = "https://coronavirusstat.ru/country/penzenskaya_oblast/";
                break;
            case 44:
                url = "https://coronavirusstat.ru/country/smolenskaya_oblast/";
                break;
            case 45:
                url = "https://coronavirusstat.ru/country/ulyanovskaya_oblast/";
                break;
            case 46:
                url = "https://coronavirusstat.ru/country/altayskiy_kray/";
                break;
            case 47:
                url = "https://coronavirusstat.ru/country/tyumenskaya_oblast/";
                break;
            case 48:
                url = "https://coronavirusstat.ru/country/primorskiy_kray/";
                break;
            case 49:
                url = "https://coronavirusstat.ru/country/astrakhanskaya_oblast/";
                break;
            case 50:
                url = "https://coronavirusstat.ru/country/kaliningradskaya_oblast/";
            case 51:
                url = "https://coronavirusstat.ru/country/volgogradskaya_oblast/";
                break;
            case 52:
                url = "https://coronavirusstat.ru/country/ivanovskaya_oblast/";
                break;
            case 53:
                url = "https://coronavirusstat.ru/country/belgorodskaya_oblast/";
                break;
            case 54:
                url = "https://coronavirusstat.ru/country/khanty_mansiyskiy_ao/";
                break;
            case 55:
                url = "https://coronavirusstat.ru/country/karachaevo_cherkesskaya_respublika/";
                break;
            case 56:
                url = "https://coronavirusstat.ru/country/respublika_buryatiya/";
                break;
            case 57:
                url = "https://coronavirusstat.ru/country/novgorodskaya_oblast/";
                break;
            case 58:
                url = "https://coronavirusstat.ru/country/kamchatskiy_kray/";
                break;
            case 59:
                url = "https://coronavirusstat.ru/country/respublika_kalmykiya/";
                break;
            case 60:
                url = "https://coronavirusstat.ru/country/respublika_sakha_yakutiya/";
                break;
            case 61:
                url = "https://coronavirusstat.ru/country/respublika_khakasiya/";
                break;
            case 62:
                url = "https://coronavirusstat.ru/country/udmurtskaya_respublika/";
                break;
            case 63:
                url = "https://coronavirusstat.ru/country/arkhangelskaya_oblast/";
                break;
            case 64:
                url = "https://coronavirusstat.ru/country/kostromskaya_oblast/";
                break;
            case 65:
                url = "https://coronavirusstat.ru/country/vologodskaya_oblast/";
                break;
            case 66:
                url = "https://coronavirusstat.ru/country/pskovskaya_oblast/";
                break;
            case 67:
                url = "https://coronavirusstat.ru/country/respublika_adygeya/";
                break;
            case 68:
                url = "https://coronavirusstat.ru/country/zabaykalskiy_kray/";
                break;
            case 69:
                url = "https://coronavirusstat.ru/country/kemerovskaya_oblast/";
                break;
            case 70:
                url = "https://coronavirusstat.ru/country/irkutskaya_oblast/";
                break;
            case 71:
                url = "https://coronavirusstat.ru/country/evreyskaya_avtonomnaya_oblast/";
                break;
            case 72:
                url = "https://coronavirusstat.ru/country/omskaya_oblast/";
                break;
            case 73:
                url = "https://coronavirusstat.ru/country/tomskaya_oblast/";
                break;
            case 74:
                url = "https://coronavirusstat.ru/country/magadanskaya_oblast/";
                break;
            case 75:
                url = "https://coronavirusstat.ru/country/respublika_krym/";
                break;
            case 76:
                url = "https://coronavirusstat.ru/country/sevastopol/";
                break;
            case 77:
                url = "https://coronavirusstat.ru/country/respublika_kareliya/";
                break;
            case 78:
                url = "https://coronavirusstat.ru/country/amurskaya_oblast/";
                break;
            case 79:
                url = "https://coronavirusstat.ru/country/kurganskaya_oblast/";
                break;
            case 80:
                url = "https://coronavirusstat.ru/country/nenetskiy_avtonomnyy_okrug/";
                break;
            case 81:
                url = "https://coronavirusstat.ru/country/respublika_tyva/";
                break;
            case 82:
                url = "https://coronavirusstat.ru/country/respublika_altay/";
                break;
            case 83:
                url = "https://coronavirusstat.ru/country/sakhalinskaya_oblast/";
                break;
            case 84:
                url = "https://coronavirusstat.ru/country/chukotskiy_avtonomnyy_okrug/";
                break;



        }
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    }

    private static Pattern pattern = Pattern.compile("\\d{2}\\.\\d{2}\\.\\d{4}");

    private static String getDate(String dateString) throws Exception {
        Matcher matcher = pattern.matcher(dateString);
        if (matcher.find()) {
            return matcher.group();
        }
        throw new Exception("Can't extract date from string!");
    }

    public static void printValues(Elements values, int indexCounter, int limitCounter) {
        for (int i = indexCounter; i < limitCounter; i++) {
            Element value = values.get(i);
            System.out.print(value.text() + "          |           ");
        }
    }


    public static void click(int n) throws Exception {
        Document page = getPage(n);
        Element tableKorona = page.select("table[class = table table-bordered small]").first();
        Elements dates = tableKorona.select("th");
        Elements values = tableKorona.select("td");
        Element citie = page.select("h2[class = h3 text-center mt-3 mb-5]").first();
        int indexCounter = 0;
        int limitCounter = 4;
        System.out.println("                                              " + "/" + citie.text() + "/");
        System.out.println();
        System.out.println();
        System.out.println("   Дата        |      Заражено                 |       " +
                "   Вылечено             |        Умерло            |            Случаев             |");
        System.out.println("------------------------------------------------------------------" +
                "------------------------------------------------------------------------------");
        for (int i = 5; i < 15; i++) {
            Element date = dates.get(i);
            String dateString = String.valueOf(date);
            String day = getDate(dateString);
            System.out.print(day + "    |    ");
            printValues(values, indexCounter, limitCounter);
            System.out.println("\n");
            System.out.println("-------------------------------------------------------------------------------------" +
                    "---------------------------------------------------------------------");
            indexCounter += 4;
            limitCounter = indexCounter + 4;

        }
    }
}

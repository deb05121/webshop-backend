package shopping;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Currency {
    private static double euroToHUF = 381;
    private static double dollarToHUF = 360;
    private static double hufToHUF = 1;
    public static void main(String[] args) throws IOException, InterruptedException {
        final var uri = URI.create("https://api.freecurrencyapi.com/v1/latest?apikey=fca_live_D5J9SaeQ7VQEABccicKZINetmPZBOtg7jh7UpALe&currencies=EUR%2CUSD%2CHUF");
        final var client = HttpClient.newHttpClient();
        final var request = HttpRequest
                .newBuilder().uri(uri)
                .GET()
                .build();
        final var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("request: " + request);
        System.out.println("response: " + response.body());
        double amountInEuros = 100;
        double amountInDollars = 150;
        double amountInForint = 1500;

       double amountInHUFFromEuros = convertToHUFFromEuros(amountInEuros);
       double amountInHUFFromDollars = convertToHUFFromDollars(amountInDollars);
       double amountInHUFFromHUFs = convertToHUFFromHUFs(amountInForint);
        System.out.println("The amount in HUF from dollar is " + amountInHUFFromDollars + " HUF.");
        System.out.println("The amount in HUF from Euro is " + amountInHUFFromEuros + " HUF.");
        System.out.println("The amount in HUF is " + amountInHUFFromHUFs);

    }

    private static double convertToHUFFromHUFs(double amountInForint) {
        return amountInForint * hufToHUF;
    }

    private static double convertToHUFFromDollars(double amountInDollars) {
        return amountInDollars * dollarToHUF;
    }

    private static double convertToHUFFromEuros(double amountInEuros) {
        return amountInEuros * euroToHUF;
    }



}

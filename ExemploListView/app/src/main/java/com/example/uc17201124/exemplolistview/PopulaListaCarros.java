package com.example.uc17201124.exemplolistview;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Created by UC17201124 on 29/08/2018.
 */

public class PopulaListaCarros {
    public static List<Carro> popular(List<Carro> carros, String[] array) {


        carros.add(new Carro("Fiat", array[0], Util.getProperty("uno", getApplicationContext()) ));
        carros.add(new Carro("Fiat", array[1], urls.getString("palio")));
        carros.add(new Carro("Wolksvagem", array[2], urls.getString("gol")) );
        carros.add(new Carro("Chevrolet", array[3], urls.getString("celta")));
        carros.add(new Carro("Tesla", array[4], urls.getString("tesla")));
        carros.add(new Carro("Chevrolet", array[5], urls.getString("opala")));
        carros.add(new Carro("Ford", array[6], urls.getString("maverick")));

        return carros;
    }
}

class Util {
    public static String getProperty(String key,Context context) throws IOException {
        Properties properties = new Properties();;
        AssetManager assetManager = context.getAssets();
        InputStream inputStream = assetManager.open("config.properties");
        properties.load(inputStream);
        return properties.getProperty(key);

    }
}
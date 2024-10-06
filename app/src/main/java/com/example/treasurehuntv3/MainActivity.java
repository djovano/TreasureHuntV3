package com.example.treasurehuntv3;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap googleMap;
    private Map<String, LatLng> cityCoordinates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializa o mapa
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapFragment);
        if (mapFragment != null) {
            mapFragment.getMapAsync(this);
        }

        // Inicializa o Spinner (ComboBox) com as cidades de Santa Catarina
        Spinner spinnerCities = findViewById(R.id.spinnerCities);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.cities_of_santa_catarina, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCities.setAdapter(adapter);

        // Mapa com coordenadas das cidades
        cityCoordinates = new HashMap<>();
        cityCoordinates.put("Abelardo Luz", new LatLng(-26.5716, -52.3226));
        cityCoordinates.put("Agrolândia", new LatLng(-27.4087, -49.8217));
        cityCoordinates.put("Agronômica", new LatLng(-27.2662, -49.7084));
        cityCoordinates.put("Água Doce", new LatLng(-26.9985, -51.5522));
        cityCoordinates.put("Águas de Chapecó", new LatLng(-27.0752, -52.9808));
        cityCoordinates.put("Águas Frias", new LatLng(-26.8796, -52.8561));
        cityCoordinates.put("Águas Mornas", new LatLng(-27.6964, -48.8244));
        cityCoordinates.put("Alfredo Wagner", new LatLng(-27.7009, -49.3278));
        cityCoordinates.put("Alto Bela Vista", new LatLng(-27.4333, -51.9043));
        cityCoordinates.put("Anchieta", new LatLng(-26.5383, -53.3314));
        cityCoordinates.put("Angelina", new LatLng(-27.5704, -48.9879));
        cityCoordinates.put("Anita Garibaldi", new LatLng(-27.6896, -51.1278));
        cityCoordinates.put("Anitápolis", new LatLng(-27.9011, -49.1316));
        cityCoordinates.put("Antônio Carlos", new LatLng(-27.5192, -48.7664));
        cityCoordinates.put("Apiúna", new LatLng(-27.0375, -49.3887));
        cityCoordinates.put("Arabutã", new LatLng(-27.1585, -52.1422));
        cityCoordinates.put("Araquari", new LatLng(-26.3757, -48.7184));
        cityCoordinates.put("Araranguá", new LatLng(-28.9356, -49.4918));
        cityCoordinates.put("Armazém", new LatLng(-28.2441, -49.0216));
        cityCoordinates.put("Aurora", new LatLng(-27.3093, -49.6293));
        cityCoordinates.put("Balneário Arroio do Silva", new LatLng(-28.9801, -49.4234));
        cityCoordinates.put("Balneário Barra do Sul", new LatLng(-26.4608, -48.6123));
        cityCoordinates.put("Balneário Camboriú", new LatLng(-26.9926, -48.6342));
        cityCoordinates.put("Balneário Gaivota", new LatLng(-29.1527, -49.5849));
        cityCoordinates.put("Balneário Piçarras", new LatLng(-26.7639, -48.6714));
        cityCoordinates.put("Bandeirante", new LatLng(-26.7706, -53.6377));
        cityCoordinates.put("Barra Bonita", new LatLng(-26.6534, -53.4398));
        cityCoordinates.put("Barra Velha", new LatLng(-26.6379, -48.6932));
        cityCoordinates.put("Bela Vista do Toldo", new LatLng(-26.2744, -50.4668));
        cityCoordinates.put("Belmonte", new LatLng(-26.8432, -53.5757));
        cityCoordinates.put("Benedito Novo", new LatLng(-26.7824, -49.3647));
        cityCoordinates.put("Biguaçu", new LatLng(-27.496, -48.6552));
        cityCoordinates.put("Blumenau", new LatLng(-26.9185, -49.0661));
        cityCoordinates.put("Botuverá", new LatLng(-27.2008, -49.0683));
        cityCoordinates.put("Braço do Norte", new LatLng(-28.2746, -49.1706));
        cityCoordinates.put("Braço do Trombudo", new LatLng(-27.3583, -49.8822));
        cityCoordinates.put("Brunópolis", new LatLng(-27.3053, -50.8686));
        cityCoordinates.put("Brusque", new LatLng(-27.0977, -48.9106));
        cityCoordinates.put("Caçador", new LatLng(-26.7758, -51.0125));
        cityCoordinates.put("Caibi", new LatLng(-27.0742, -53.2451));
        cityCoordinates.put("Calmon", new LatLng(-26.5941, -51.0947));
        cityCoordinates.put("Camboriú", new LatLng(-27.0241, -48.6503));
        cityCoordinates.put("Campo Alegre", new LatLng(-26.195, -49.2677));
        cityCoordinates.put("Campo Belo do Sul", new LatLng(-27.8976, -50.7597));
        cityCoordinates.put("Campo Erê", new LatLng(-26.3934, -53.0851));
        cityCoordinates.put("Campos Novos", new LatLng(-27.4004, -51.2276));
        cityCoordinates.put("Canelinha", new LatLng(-27.2654, -48.7656));
        cityCoordinates.put("Canoinhas", new LatLng(-26.1771, -50.3908));
        cityCoordinates.put("Capão Alto", new LatLng(-27.9384, -50.5097));
        cityCoordinates.put("Capinzal", new LatLng(-27.3477, -51.6051));
        cityCoordinates.put("Capivari de Baixo", new LatLng(-28.4498, -48.9633));
        cityCoordinates.put("Catanduvas", new LatLng(-27.0697, -51.6606));
        cityCoordinates.put("Caxambu do Sul", new LatLng(-27.1623, -52.8801));
        cityCoordinates.put("Celso Ramos", new LatLng(-27.6323, -51.3358));
        cityCoordinates.put("Cerro Negro", new LatLng(-27.7946, -50.8679));
        cityCoordinates.put("Chapadão do Lageado", new LatLng(-27.5903, -49.5534));
        cityCoordinates.put("Chapecó", new LatLng(-27.1004, -52.615));
        // Adicione outras cidades conforme necessário

        spinnerCities.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedCity = (String) parent.getItemAtPosition(position);
                LatLng cityCenter = cityCoordinates.get(selectedCity);
                if (cityCenter != null && googleMap != null) {
                    LatLng randomLocation = getRandomLocation(cityCenter, 10.0);
                    googleMap.clear(); // Limpar marcadores anteriores
                    googleMap.addMarker(new MarkerOptions().position(randomLocation).title("Localização Aleatória"));
                    googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(randomLocation, 12));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Nenhuma ação necessária
            }
        });
    }

    @Override
    public void onMapReady(@NonNull GoogleMap map) {
        googleMap = map;
    }

    // Função para gerar uma localização aleatória dentro de um raio de 10 km a partir do centro da cidade
    private LatLng getRandomLocation(LatLng center, double radiusInKm) {
        Random random = new Random();

        // Converter raio para graus
        double radiusInDegrees = radiusInKm / 111.32;

        double u = random.nextDouble(); // Valor aleatório entre 0 e 1
        double v = random.nextDouble(); // Valor aleatório entre 0 e 1
        double w = radiusInDegrees * Math.sqrt(u);
        double t = 2 * Math.PI * v;
        double x = w * Math.cos(t);
        double y = w * Math.sin(t);

        // Ajustar a posição com base na latitude e longitude do centro
        double newLat = center.latitude + x;
        double newLng = center.longitude + y / Math.cos(Math.toRadians(center.latitude));

        return new LatLng(newLat, newLng);
    }
}

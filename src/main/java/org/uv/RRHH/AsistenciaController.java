package org.uv.empleado;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class AsistenciaController {

    public String registrarAsistencia(Asistencia asistencia) {
        try {
            // Crear URL y conexión
            URL url = new URL("http://localhost/controllers/rrhh-controllers/asistencia-controller.php?action=registrar");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // Configurar la solicitud
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            // Crear el cuerpo de la solicitud
            String postData = "txtClaveEmpleado=" + URLEncoder.encode(asistencia.getClaveEmpleado(), "UTF-8")
                    + "&txtFecha=" + URLEncoder.encode(asistencia.getFecha(), "UTF-8")
                    + "&txtHora=" + URLEncoder.encode(asistencia.getHora(), "UTF-8")
                    + "&txtTipo=" + URLEncoder.encode(asistencia.getTipo(), "UTF-8");

            // Enviar la solicitud
            try (DataOutputStream wr = new DataOutputStream(conn.getOutputStream())) {
                wr.writeBytes(postData);
                wr.flush();
            }

            // Leer la respuesta del servidor
            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Leer la respuesta del servidor
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Devolver respuesta exitosa
                return "Asistencia registrada exitosamente: " + response.toString();
            } else {
                // Devolver mensaje de error en caso de que no sea HTTP_OK
                return "Error al registrar asistencia. Código de respuesta: " + responseCode;
            }

        } catch (Exception e) {
            e.printStackTrace();
            // Devolver mensaje de error
            return "Ocurrió un error al registrar la asistencia: " + e.getMessage();
        } 
    }
}

try {
    String newClient = name + " - " + dateNowText + "-" + hourNowInvText + ".txt";
    System.out.println(newClient);
    String src = "./" + newClient;
    String content = 
    "R U M B O S  Y  M U N D O S\n\n" +
    "CEL : 910594824\n" +
    "------------------------------------\n" +
    "BOLETA DE VENTA\n" +
    "\tBB00-00\n" +
    "Fecha de emision:\n" +
    dateNowText + "\n" +
    hourNowText + "\n\n"
            + "\tR E S U M E N\n\n"
            + "Nombre \t\t" + name + "\n"
            + "DNI \t\t" + dniText.getText().toString() + "\n"
            + "Teléfono \t" + phoneText.getText().toString() + "\n"
            + "Origen  \t" + origin + "\n"
            + "Destino \t" + destination + "\n"
            + "Aerolínea \t" + airlineText.getSelectedItem().toString() + "\n"
            + "Viaje \t\t" + travel + "\n"
            + "Maletas \t" + baggage + "\n"
            + "N° Pasajeros \t" + passengers + "\n"
            + "\nPrecio por pasajero\n"
            + "Soles \t\tS./" + String.format("%.2f", (price * exchange)) + "\n"
            + "Dólares \t $ " + String.format("%.2f", price) + "\n"
            + "\nPrecio total\n"
            + "Soles \t\tS./" + String.format("%.2f", (totalPrice * exchange))
            + "\nDólares \t $ " + String.format("%.2f", totalPrice) + "\n"
            + "\nTipo de cambio aplicado: " + exchange;

    String info = "\n\nPsdta\n"
            + "La información del itinerario y datos del vuelo\n"
            + "se le enviaran a su Whatsapp\n";

    String contact = "\nHecho con el corazón y la nota por Kenyi Hancco\n"
            + "© Copyright 2022 - Todos los derechos reservados.\n"
            + "\n¿Quieres saber más de mí?\n"
            + "Visita mi pagina web ⬇\n"
            + "http://kenyihq.com\n";

    File file = new File(src);
    // Si el archivo no existe es creado
    if (!file.exists()) {
        file.createNewFile();
    }
    FileWriter fw = new FileWriter(file);
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write(content);
    bw.write(info);
    bw.write(contact);
    bw.close();
} catch (Exception e) {
    e.printStackTrace();
}
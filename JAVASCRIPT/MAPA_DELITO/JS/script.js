// Inicializar el mapa
const map = L.map('map').setView([0, 0], 2); // Vista inicial en el centro del mundo

// Agregar una capa de mapa (puedes usar otros proveedores como Mapbox o Google Maps)
L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
    attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
}).addTo(map);

// Solicitar ubicación y detalles del delito al usuario
const lat = parseFloat(prompt("Ingrese la latitud del delito:"));
const lon = parseFloat(prompt("Ingrese la longitud del delito:"));
const descripcion = prompt("Ingrese una descripción del delito:");

// Agregar un marcador al mapa con la ubicación y descripción del delito
L.marker([lat, lon]).addTo(map)
    .bindPopup(descripcion)
    .openPopup();
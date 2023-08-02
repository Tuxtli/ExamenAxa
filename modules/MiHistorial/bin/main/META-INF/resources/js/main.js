/**
 *Eventos para linea de tiempo  
 */

document.addEventListener("DOMContentLoaded", function () {
  const timelineChips = document.querySelectorAll(".timeline-chip");
  const timelineEvents = document.querySelectorAll(".timeline-event");

  // Asignar eventos de clic para chips de año
  timelineChips.forEach(function (chip) {
    chip.addEventListener("click", function () {
      timelineChips.forEach(function (otherChip) {
        otherChip.classList.remove("active");
      });
      chip.classList.add("active");
      
    });
  });

  // Asignar eventos de clic para eventos de la línea de tiempo
  timelineEvents.forEach(function (event) {
    event.addEventListener("click", function () {
      timelineEvents.forEach(function (otherEvent) {
        otherEvent.classList.remove("active");
      });
      event.classList.add("active");
      
    });
  });
});
Es
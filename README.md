# 💧 Automated Irrigation System

A complete IoT system that automates plant watering based on real-time soil moisture data. It combines hardware (Arduino, moisture sensor, water pump) with a web dashboard for monitoring and manual control.

## 📋 Overview
This project is a working prototype addressing the global issue of water waste in agriculture. The system automatically waters a plant when soil moisture drops below a set threshold. It includes a web UI for monitoring status and manual intervention.

**Key Features:**
- **Real-time Sensing:** Measures soil moisture using an Adafruit sensor.
- **Automated Control:** A microcontroller actuates a water pump based on sensor data.
- **Web Dashboard:** Displays current soil moisture, system status (on/off), and historical data.


## 🚀 How to Run
1. **Hardware Setup:**
   - Connect the moisture sensor, relay, and water pump to the Arduino.
   - Upload the `irrigation_controller.py` script to the microcontroller.
2. **Web Dashboard:**
   ```bash
   pip install flask pyserial
   python backend/app.py



🧠 How It Works
Soil Moisture Sensor: Reads analog values and converts them to a moisture percentage.

Control Logic: If moisture is below a threshold (e.g., 30%), the water pump turns on.

Web UI: Uses Flask to serve data and display real-time status.

🛠️ Technology Stack
Hardware: Arduino Uno, Adafruit Soil Sensor, Relay Module, DC Water Pump.

Backend: Python (Flask/SpringBoot), PySerial.

Frontend: HTML, CSS, JavaScript.

🔮 Future Improvements
Add a database to track moisture history and generate trends.

Implement a "Water Now" button for manual override.

Scale to a multi-zone system for farms.



# Automated Watering System

## Project Overview
This project is a prototype of an Automated Irrigation System designed to optimize water usage in agriculture and gardening. The system detects soil moisture levels and automatically controls a water pump to provide adequate irrigation to an indoor planter. By leveraging information technology solutions, this system aims to reduce water waste, prevent over/under-watering, and promote sustainable practices in agriculture.

## Problem Statement
Fresh and potable water is becoming increasingly scarce globally, with agriculture accounting for approximately 70% of global freshwater withdrawals (FAO, 2017). Inefficient irrigation practices lead to reduced crop yields, soil salinization, water-logging, and depletion of groundwater resources. This project addresses these issues by creating an automated system that ensures plants receive the optimal amount of water.

## System Components

### Hardware
- **Raspberry Pi Pico** – Microcontroller used to process sensor data and control the water pump
- **Adafruit Soil Moisture Sensor** – Measures soil moisture levels (uses I2C interface)
- **Relay Module** – Controls the water pump based on signals from the microcontroller
- **DC Submersible Water Pump** – Directs water from a container to the soil
- **Plastic Tubing** – Transfers water from the pump to the soil
- **Plastic Container** – Holds the water source
- **Power Source** – Battery or solar-powered adapter

### Software
- **Python** – Programming language for the microcontroller (used with Thonny IDE)
- **Spring Boot MVC Framework** – Backend web framework for the user interface
- **Thymeleaf** – Template engine for the HTML pages
- **HTML/CSS** – For the user interface design
- **Visual Studio Code** – IDE for the web interface development

## Features
- **Automated Watering** – The system turns the water pump ON when soil moisture is below the dry threshold and OFF when it reaches the wet threshold
- **Real-time Monitoring** – Displays soil moisture levels and water pump status
- **Responsive UI** – Two-page layout (Index and Manage Water) that adapts to different screen sizes
- **User-Friendly Interface** – Simple and easy to navigate

## How It Works
1. The soil moisture sensor continuously reads the moisture level in the soil
2. The Raspberry Pi Pico processes this data using Python code
3. If the moisture level is below the dry threshold (DRY_THRESHOLD = 55000), the pump is turned ON
4. If the moisture level reaches or exceeds the wet threshold (WET_THRESHOLD = 25000), the pump is turned OFF
5. The system checks soil moisture every 10 seconds
6. The web interface (Spring Boot) displays the current soil moisture level and water pump status



## How to Run the Web Interface
1. Clone the repository: `git clone https://github.com/KelseySemien/watering-system.git`
2. Navigate to the project directory: `cd watering-system`
3. Build the project: `./mvnw clean install` (on Unix) or `mvnw.cmd clean install` (on Windows)
4. Run the application: `./mvnw spring-boot:run` or `mvnw.cmd spring-boot:run`
5. Open a browser and go to: `http://localhost:8080`

## How to Run the Microcontroller Code
1. Connect the Raspberry Pi Pico to your computer via USB
2. Open Thonny IDE
3. Load the `main.py` file (see Appendix A in project documentation)
4. Upload the code to the Raspberry Pi Pico
5. The system will start monitoring soil moisture and controlling the pump automatically

## Calibration
The soil moisture sensor was calibrated by:
1. Inserting the sensor into dry soil to get the DRY_THRESHOLD reading
2. Inserting the sensor into water to get the WET_THRESHOLD reading
3. Adjusting the threshold values in the Python code based on these readings

## Testing
- Hardware testing: The moisture sensor and relay were tested by repeatedly inserting the sensor into water and drying it off. The pump turned ON when dry and OFF when wet.
- UI testing: The web interface was tested to verify it loads correctly and displays the data.
- Two-week monitoring: The system was monitored over two weeks to verify plant health and soil moisture levels.

## Known Issues
- The current web interface does not always display the soil moisture sensor data or water pump status in real-time. This is a known issue that requires further debugging.
- The system relies on a simple threshold-based approach; more sophisticated logic (e.g., weather-based scheduling) could be added in the future.

## Future Enhancements
1. **Fix Real-Time Data Display** – Debug the backend logic to ensure sensor data is displayed correctly on the web interface
2. **Manual Water Button** – Add a "Water Now" button to allow users to manually trigger the pump
3. **Database Integration** – Add a database to collect and store soil moisture data over time
4. **Graphical Display** – Display historical soil moisture data in a graph within the UI
5. **Mobile App** – Create a mobile application for remote monitoring


## References
- Adafruit Industries. (n.d.). Soil sensor. Retrieved from https://www.adafruit.com/product/4026
- Food and Agriculture Organization of the United Nations. (2017). Water for sustainable food and agriculture.
- Hanson, B., Grattan, S. R., & Fulton, A. (2006). Agricultural salinity and drainage.
- Perry, C., Steduto, P., Allen, R. G., & Burt, C. M. (2009). Increasing productivity in irrigated agriculture.
- Tzanakakis, V. A., Paranychianakis, N. V., & Angelakis, A. N. (2020). Water supply and water scarcity.


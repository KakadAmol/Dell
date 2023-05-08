public class Laptop {

    public class Processor {
        private String brand;
        private String type;
        private int hardDriveCapacity;
        private String coreType;
        private String videoGamePlatform;
        private String manufacturer;
        private String productLine;
        private String condition;
        private double processorSpeed;
        private String manufacturerPartNumber;

        public Processor(String brand, String type, int hardDriveCapacity, String coreType, String videoGamePlatform,
                         String manufacturer, String productLine, String condition, double processorSpeed,
                         String manufacturerPartNumber) {
            this.brand = brand;
            this.type = type;
            this.hardDriveCapacity = hardDriveCapacity;
            this.coreType = coreType;
            this.videoGamePlatform = videoGamePlatform;
            this.manufacturer = manufacturer;
            this.productLine = productLine;
            this.condition = condition;
            this.processorSpeed = processorSpeed;
            this.manufacturerPartNumber = manufacturerPartNumber;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getHardDriveCapacity() {
            return hardDriveCapacity;
        }

        public void setHardDriveCapacity(int hardDriveCapacity) {
            this.hardDriveCapacity = hardDriveCapacity;
        }

        public String getCoreType() {
            return coreType;
        }

        public void setCoreType(String coreType) {
            this.coreType = coreType;
        }

        public String getVideoGamePlatform() {
            return videoGamePlatform;
        }

        public void setVideoGamePlatform(String videoGamePlatform) {
            this.videoGamePlatform = videoGamePlatform;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public String getProductLine() {
            return productLine;
        }

        public void setProductLine(String productLine) {
            this.productLine = productLine;
        }

        public String getCondition() {
            return condition;
        }

        public void setCondition(String condition) {
            this.condition = condition;
        }

        public double getProcessorSpeed() {
            return processorSpeed;
        }

        public void setProcessorSpeed(double processorSpeed) {
            this.processorSpeed = processorSpeed;
        }

        public String getManufacturerPartNumber() {
            return manufacturerPartNumber;
        }

        public void setManufacturerPartNumber(String manufacturerPartNumber) {
            this.manufacturerPartNumber = manufacturerPartNumber;
        }
    

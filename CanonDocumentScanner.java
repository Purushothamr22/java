class CanonDocumentScanner {

    public static void main(String[] args) {

        String brand = "Canon";
        String manufacturer = "Canon";
        String model = "CanoScan LiDE400";
        String productDimensions = "17.03 x 3.6 x 12.5 cm";
        String itemModelNumber = "CanoScan LiDE400";
        int resolution = 4800;
        String lightSourceType = "LED";
        boolean areBatteriesIncluded = false;
        boolean areBatteriesRequired = false;
        String connectorType = "USB";
        String mediaType = "Documents, Photo";
        boolean containsLiquid = false;
        String countryOfOrigin = "China";
        String itemWeight = "1.63 kg";

		
        System.out.println("Brand: " + brand);
        System.out.println("Manufacturer: " + manufacturer); 
        System.out.println("Product Dimensions: " + productDimensions);
        System.out.println("Item Model Number: " + itemModelNumber);
        System.out.println("Resolution: " + resolution);
        System.out.println("Light Source Type: " + lightSourceType);
        System.out.println("Batteries Included: " + areBatteriesIncluded);
        System.out.println("Batteries Required: " + areBatteriesRequired);
        System.out.println("Connector Type: " + connectorType);
        System.out.println("Media Type: " + mediaType);
        System.out.println("Does it contain liquid? " + containsLiquid);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Item Weight: " + itemWeight );
    }
}
 
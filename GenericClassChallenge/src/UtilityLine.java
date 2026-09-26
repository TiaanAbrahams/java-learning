public class UtilityLine implements Mappable{
    enum UsageType {
        WATER_SUPPLY,
        ELECTRICITY,
        SEWAGE,
        TELECOMUNICATIONS;
    }
        private UsageType usage;
        private String name;

        public UtilityLine(String name, UsageType usage) {
            this.name = name.toLowerCase();
            this.usage = usage;
        }

        @Override
        public String getLabel() {
            return name + "(" + usage +")";
        }

        @Override
        public Geomitry getShape() {
            return Geomitry.LINE;
        }

        @Override
        public String getMarker() {
            return switch (usage){
                case ELECTRICITY -> Colour.YELLOW + " " + LineMarker.DASHED;
                case SEWAGE -> Colour.RED + " " + LineMarker.DOTTED;
                case WATER_SUPPLY -> Colour.BLUE + " " + LineMarker.SOLID;
                case TELECOMUNICATIONS -> Colour.ORANGE + " " + LineMarker.DOTTED;
                default -> Colour.BLACK + " " + LineMarker.DOTTED;
            };
        }

        @Override
        public String toJSON() {
            return Mappable.super.toJSON() + """
                "name": "%s", "usage": "%s" """.formatted(name, usage);
        }
    }

package tiagobarbosa.marathonjava.javacore.Kenum.domain;

public enum ClientType {
    PHYSICAL_PERSON(1, "Physical person"),
    LEGAL_PERSON(2, "Legal person");

    public final int VALUE;
    public final String REPORT_NAME;

    ClientType(int value, String reportName) {
        this.VALUE = value;
        this.REPORT_NAME = reportName;
    }

    public static ClientType clientTypeForReportName(String reportName){
        for (ClientType clientType : values()) {
            if (clientType.REPORT_NAME.equals(reportName)){
                return clientType;
            }
        }
        return null;
    }
}

package structural.decorator.guru;

import java.util.Base64;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String encode(String data) {
        int count = 0;
        byte[] result = data.getBytes();

        for (int iData : result) {
            result[count] += (byte) 1;
            count++;
        }

        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        int count = 0;
        byte[] result = Base64.getDecoder().decode(data);

        for (int iData : result) {
            result[count] -= (byte) 1;
            count++;
        }

        return new String(result);
    }
}

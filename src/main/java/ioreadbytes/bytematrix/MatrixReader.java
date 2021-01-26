package ioreadbytes.bytematrix;


import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MatrixReader {

    private List<byte[]>matrix = new ArrayList<>();


    public void readBytes(String fileName){

        Path path = Path.of(fileName);

        try (InputStream inputStream = Files.newInputStream(path)){
            byte[] buffer = new byte[1000];
            int size = 0;

            while((size = inputStream.read(buffer))>0) {
                matrix.add(buffer);

            }
        } catch (IOException eoe) {
           throw new IllegalStateException("Cannot read file, ioe");
        }
    }

    public int columnCounterWithMoreZeros(){
        int numberOfColumns = 0;
        for (int i=1; i< 1000; i++) {
            int ZeroCounter = 0;
            int OneCounter = 0;

            for(int j = 0; j< matrix.size(); j++){          //itt elakadtam:(
                if(matrix.get(j)[i] ==48) {
                    ZeroCounter++;
                }else{
                    OneCounter++;
                }
            }
            if(ZeroCounter > OneCounter) {
                numberOfColumns++;
            }
        }
        return numberOfColumns;

    }

    public List<byte[]> getMatrix() {
        return new ArrayList<>(matrix);
    }
}

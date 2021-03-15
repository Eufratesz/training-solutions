package stringmethods;

public class FileNameManipulator {


    public char findLastCharacter(String str) {
        if (isEmpty(str)) {
            throw new IllegalArgumentException("Empty string");
        }
        str = str.trim();
        return str.charAt(str.length() - 1);
    }

    public String findFileExtension(String fileName) {
        if (isEmpty(fileName)) {
            throw new IllegalArgumentException("invalid file name");
        }
        fileName = fileName.trim();
        int indexOfDot = fileName.lastIndexOf(".");

        if (indexOfDot < 1 || indexOfDot == fileName.length() - 1) {
            throw new IllegalArgumentException("invalid file name");
        }
        String extension = fileName.substring(indexOfDot);
        return extension;
    }

    public boolean identifyFilesByExtension(String ext, String fileName) {
        if (isEmpty(ext) || isEmpty(fileName)) {
            throw new IllegalArgumentException("invalid file name");
        }
        fileName = fileName.trim();
        ext = ext.trim();
        int indexOfDot = fileName.lastIndexOf(".");
        if (indexOfDot < 1 || indexOfDot == fileName.length() - 1) {
            throw new IllegalArgumentException("invalid file name");
        }
        return fileName.endsWith(ext);
    }

    public boolean compareFilesByName(String searchedFilename, String acturalFileName) {
        if (isEmpty(searchedFilename) || isEmpty(acturalFileName)) {
            throw new IllegalArgumentException("invalid file name");
        }
        searchedFilename = searchedFilename.trim().toLowerCase();
        acturalFileName = acturalFileName.trim().toLowerCase();
        return searchedFilename.equals(acturalFileName);
    }

    public String changeExtensionToLowerCase(String fileName) {
        if (isEmpty(fileName)) {
            throw new IllegalArgumentException("invalid file name");
        }
        fileName = fileName.trim();
        int dotIndex = fileName.lastIndexOf(".");
        if (dotIndex < 1 || dotIndex > fileName.length() - 1) {
            throw new IllegalArgumentException("file name must contain a '.'");
        }
        String nameOfFileName = fileName.substring(0, dotIndex);
        String extension = fileName.substring(dotIndex).toLowerCase();
        return nameOfFileName + extension;
    }

    public String replaceStringPart(String fileName, String present, String target) {
        if (isEmpty(fileName)) {
            throw new IllegalArgumentException("invalid file name");
        }
        if(fileName.contains(present)){
            return fileName.replace(present, target);
        }
        return fileName;
    }


    private boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }
}


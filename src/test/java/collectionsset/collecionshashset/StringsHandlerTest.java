package collectionsset.collecionshashset;

import collectionsset.helper.RandomStringGenerator;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class StringsHandlerTest {

    @Test
    void checkNumberOfElementsInSet(){
        Collection<String>testCollecion = new RandomStringGenerator().createStrings(4, 500_000);

        //When
        Set<String>stringSet = new StringsHandler().filterUniqueStrings(testCollecion);

        //Then
        assertTrue(stringSet.size() < testCollecion.size());
    }

    @Test
    void checkNumberOfIdenticalElementsInSet(){
        //Given
        Set<String>setA = new HashSet<>(new RandomStringGenerator().createStrings(4, 500_000));
        Set<String>setB = new HashSet<>(new RandomStringGenerator().createStrings(4, 500_000));
        int a = setA.size();
        int b = setB.size();

        //When
        setA = new StringsHandler().selectIdenticalStrings(setA, setB);

        //Then
        assertTrue(setA.size() < (a + b));

    }
}
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class RandomClassifier extends Experimenter {
	Random randomGen = new Random();
	
	@Override
	Map<SocialMediaEntry, Boolean> classifyEntries(Set<SocialMediaEntry> trainingSet,
            Set<SocialMediaEntry> testSet) {
        
        System.out.println("Running classifier...");
        
        // In a real use case, build a machine learning model from the training set,
        // then use it to classify the entries in the test set.

        
        Map<SocialMediaEntry, Boolean> results = new HashMap<>();
        
        // Right now this is putting a "true" for everything
        // TODO: This method will need to be changes / replaced.
        for (SocialMediaEntry entry : testSet) {
            results.put(entry, randomGen.nextBoolean());
        }
        
        return results;
    }

}

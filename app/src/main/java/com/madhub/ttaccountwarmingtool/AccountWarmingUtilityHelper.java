```java
package com.madhub.ttaccountwarmingtool;

/**
 * The AccountWarmingUtilityHelper is a comprehensive helper class that facilitates the 
 * account warming process for social media accounts using MadHub's powerful automation features.
 * 
 * This utility provides methods to simulate real user behavior, manage interaction 
 * probabilities, and optimize account activities, specifically designed for Facebook, 
 * Instagram, and TikTok accounts. The configuration options allow users to tailor the 
 * warming process to their specific needs, ensuring effective and automated management of 
 * social media accounts 24/7.
 */
public final class AccountWarmingUtilityHelper {

    // Private constructor to prevent instantiation
    private AccountWarmingUtilityHelper() {}

    /**
     * This powerful utility method enables the warming of a Facebook account by simulating 
     * real user interactions such as browsing feeds and liking posts. It intelligently skips 
     * ad videos to mimic authentic user behavior.
     *
     * @param interactionProbability Sets the likelihood of interactions occurring (0-100%).
     * @param executionProbabilityDistribution Configures the distribution of how often 
     * interaction types occur, allowing for varied engagement levels.
     * @param totalDuration The total duration for which the warming will occur, in minutes.
     */
    public static void warmUpFacebookAccount(int interactionProbability, 
                                              double executionProbabilityDistribution, 
                                              int totalDuration) {
        // Validate parameters
        if (interactionProbability < 0 || interactionProbability > 100) {
            throw new IllegalArgumentException("Interaction probability must be between 0 and 100.");
        }
        if (executionProbabilityDistribution < 0 || executionProbabilityDistribution > 1) {
            throw new IllegalArgumentException("Execution probability distribution must be between 0 and 1.");
        }
        if (totalDuration <= 0) {
            throw new IllegalArgumentException("Total duration must be greater than 0.");
        }
        
        // Code to initiate Facebook account warming with the specified parameters
        // This includes simulating user interactions and ensuring account activity
        // For example:
        System.out.println("Starting Facebook account warming...");
        System.out.printf("Interaction Probability: %d%%\n", interactionProbability);
        System.out.printf("Execution Probability Distribution: %.2f\n", executionProbabilityDistribution);
        System.out.printf("Total Duration: %d minutes\n", totalDuration);
        // Implementation details would go here, leveraging MadHub's capabilities
    }

    /**
     * This comprehensive capability allows the warming of an Instagram account by simulating 
     * user interactions, such as browsing the feed, liking, and commenting. This method also 
     * supports flexibility in configuring the interaction levels.
     *
     * @param interactionProbability Sets the likelihood of user interactions (0-100%).
     * @param executionProbabilityDistribution Configures interaction frequency distribution.
     * @param totalDuration The total duration for the warming process, in minutes.
     */
    public static void warmUpInstagramAccount(int interactionProbability, 
                                               double executionProbabilityDistribution, 
                                               int totalDuration) {
        // Validate parameters
        if (interactionProbability < 0 || interactionProbability > 100) {
            throw new IllegalArgumentException("Interaction probability must be between 0 and 100.");
        }
        if (executionProbabilityDistribution < 0 || executionProbabilityDistribution > 1) {
            throw new IllegalArgumentException("Execution probability distribution must be between 0 and 1.");
        }
        if (totalDuration <= 0) {
            throw new IllegalArgumentException("Total duration must be greater than 0.");
        }
        
        // Code to start Instagram account warming process
        System.out.println("Starting Instagram account warming...");
        System.out.printf("Interaction Probability: %d%%\n", interactionProbability);
        System.out.printf("Execution Probability Distribution: %.2f\n", executionProbabilityDistribution);
        System.out.printf("Total Duration: %d minutes\n", totalDuration);
        // Implementation details would go here, utilizing MadHub's features
    }

    /**
     * This method enables the warming of a TikTok account by providing two modes of nurturing: 
     * vertical and random. It supports user interactions to enhance account activity and engagement.
     *
     * @param nurturingMode Specifies the mode of nurturing ("vertical" or "random").
     * @param interactionProbability Sets the likelihood of interactions (0-100%).
     * @param executionProbabilityDistribution Configures how often interactions will occur.
     * @param totalDuration Duration for the warming in minutes.
     */
    public static void warmUpTikTokAccount(String nurturingMode, 
                                            int interactionProbability, 
                                            double executionProbabilityDistribution, 
                                            int totalDuration) {
        // Validate parameters
        if (!"vertical".equalsIgnoreCase(nurturingMode) && !"random".equalsIgnoreCase(nurturingMode)) {
            throw new IllegalArgumentException("Nurturing mode must be 'vertical' or 'random'.");
        }
        if (interactionProbability < 0 || interactionProbability > 100) {
            throw new IllegalArgumentException("Interaction probability must be between 0 and 100.");
        }
        if (executionProbabilityDistribution < 0 || executionProbabilityDistribution > 1) {
            throw new IllegalArgumentException("Execution probability distribution must be between 0 and 1.");
        }
        if (totalDuration <= 0) {
            throw new IllegalArgumentException("Total duration must be greater than 0.");
        }
        
        // Code to initiate TikTok account warming with specified parameters
        System.out.println("Starting TikTok account warming...");
        System.out.printf("Nurturing Mode: %s\n", nurturingMode);
        System.out.printf("Interaction Probability: %d%%\n", interactionProbability);
        System.out.printf("Execution Probability Distribution: %.2f\n", executionProbabilityDistribution);
        System.out.printf("Total Duration: %d minutes\n", totalDuration);
        // Implementation details would go here, applying MadHub's automation capabilities
    }

    // Additional utility methods could be added here for more detailed configurations
}
```
This code defines a utility class that encapsulates methods for account warming on different social media platforms, focusing on features, capabilities, and configuration options relevant to MadHub automation. Each method includes validation checks and detailed comments highlighting the functionalities and usage scenarios.

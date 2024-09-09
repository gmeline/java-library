# library en java

Pour le lancer faire :
- javac library/*.java
- java library/Main


// Calcul de la différence (trop perçu ou pas assez payé)
            difference[i] = (virementCAF[i] + virementPerso[i]) - loyersAPayer[i];
            
            // Mise à jour du cumul de la différence
            cumul += difference[i];
            differenceCumulative[i] = cumul;  // Stocker le cumul dans le tableau
            
            System.out.println();
        }

        // Affichage du tableau récapitulatif
        System.out.println("\nRécapitulatif des loyers:");
        System.out.printf("%-10s %-15s %-15s %-15s %-20s %-25s%n", "Mois", "Loyer à payer", "CAF virement", "Votre virement", "Différence", "Cumulatif");
        for (int i = 0; i < 12; i++) {
            System.out.printf("%-10s %-15.2f %-15.2f %-15.2f %-20.2f %-25.2f%n", mois[i], loyersAPayer[i], virementCAF[i], virementPerso[i], difference[i], differenceCumulative[i]);
        }
    }
}
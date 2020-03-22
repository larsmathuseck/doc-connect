package de.lars.mathuseck.docconnect

import de.lars.mathuseck.docconnect.models.Question

object Model {
    var questions: MutableList<Question> = mutableListOf(
        Question(
            "Question0",
            "Hilft Ibuprofen gegen SARS-CoV-2?",
            "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et d",
            55
        ),
        Question(
            "Question1",
            "Wie kann ich mit Situation X umgehen?",
            "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et d",
            354
        ),
        Question(
            "Question2",
            "Wie kann ich mit Situation Y umgehen?",
            "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et d",
            231
        ),
        Question(
            "Question3",
            "Wie kann ich mit Situation A umgehen?",
            "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et d",
            90
        ),
        Question(
            "Question4",
            "Wie kann ich mit Situation B umgehen?",
            "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et d",
            10
        ),
        Question(
            "Question5",
            "Wie kann ich mit Situation C umgehen?",
            "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et d",
            201
        ),
        Question(
            "Question6",
            "Wie kann ich mit Situation D umgehen?",
            "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et d",
            144
        ),
        Question(
            "Question7",
            "Wie kann ich mit Situation E umgehen?",
            "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et d",
            37
        )
    )

    var answeredQuestions = mutableListOf(
        Question(
            "Question0",
            "Was ist über COVID-19 bei Kindern und Schwangeren bekannt?",
            "Ich habe von verschiedenen Stellen mitbekommen, dass Kinder und Jugendliche nicht wirklich betroffen sind. Ist das richtig?",
            55,
            answer = "Bisherigen Daten zufolge ist die Symptomatik von COVID-19 bei Kindern deutlich geringer ausgeprägt ist als bei Erwachsenen. Zum tatsächlichen Beitrag von Kindern und Jugendlichen an der Transmission in der Bevölkerung liegen keine Daten vor. Aufgrund der hohen Kontagiosität des Virus und dem engen Kontakt zwischen Kindern und Jugendlichen untereinander erscheint es jedoch plausibel, dass Transmissionen stattfinden.\n" +
                    "\n" +
                    "Schwangere scheinen der WHO und deren Daten aus China zufolge kein erhöhtes Risiko für einen schweren Krankheitsverlauf zu haben. Es gibt bislang keine Hinweise darauf, dass COVID-19 auf das Kind im Mutterleib übertragbar ist. Eine Übertragung auf das neugeborene Kind ist über den engen Kontakt und eine Tröpfcheninfektion möglich, bisher gibt es jedoch keine Nachweise von SARS-CoV-2 in der Muttermilch. Die Datenlage ist derzeit aber noch nicht ausreichend, um diese und andere Fragen zu COVID-19 in der Schwangerschaft sicher zu beantworten."
        ),
        Question(
            "Question1",
            "Was bringt die Pneumokokken-Impfung in der aktuellen COVID-19-Pandemie?",
            "Viele meiner Patienten fragen nach einer Pneumokokken-Impfung. Gibt diese Impfung einen effektiven Schutz gegen COVID-19?",
            354,
            answer = "Die Pneumokokken-Impfung schützt nicht vor COVID-19. Allerdings können Pneumokokken-Infektionen zu schweren Lungenentzündungen und Sepsis führen und die Versorgung der Patienten auf einer Intensivstation ggf. mit Beatmung erfordern. Dies gilt es gerade bei einem ohnehin schon über die Maßen belasteten Gesundheitssystem zu vermeiden. Die STIKO empfiehlt – unabhängig von der COVID-19-Pandemie - für alle Personen, die ein erhöhtes Risiko für Pneumokokken-Erkrankungen haben, eine entsprechende Impfung. Es ist zudem plausibel, dass die Pneumokokken-Impfung eine bakterielle Superinfektion durch Pneumokokken bei Patienten mit COVID-19 verhindern kann. Bei Influenza-Erkrankungen sind bakterielle Superinfektionen durch Pneumokokken eine bekannte Komplikation. Die aktuelle Datenlage ist jedoch unzureichend um einzuschätzen, wie häufig solche Superinfektionen bei COVID-19 Patienten vorkommen.\\n\" +\n" +
                    "                    \"\\n\" +\n" +
                    "                    \"Aktuell sind Pneumokokken-Impfstoffe in Deutschland nur sehr eingeschränkt verfügbar. Daher sollten zurzeit prioritär Personen geimpft werden, die ein besonders hohes Risiko für Pneumokokken-Erkrankungen haben.\\n\" +\n" +
                    "                    \"\\n\" +\n" +
                    "                    \"Prioritär geimpft werden sollen:\\n\" +\n" +
                    "                    \"\\n\" +\n" +
                    "                    \"-    Säuglinge und Kleinkinder bis zum Alter von 2 Jahren mit Prevenar 13 oder Synflorix\\n\" +\n" +
                    "                    \".    Personen mit Immundefizienz, Senioren ab 70 Jahren und Personen mit chronischen Atemwegserkrankungen (z.B. Asthma oder COPD) mit Pneumovax 23\\n\" +\n" +
                    "                    \"\\n\" +\n" +
                    "                    \"Bei Arztkontakten zur Inanspruchnahme von Impfungen sollte vorher telefonisch geklärt werden, dass der Praxisbesuch ohne Kontakt zu Patienten mit Symptomen eines respiratorischen Infekts stattfinden kann und ob Impfstoffe verfügbar sind.\",\n" +
                    "         "
        ),
        Question(
            "Question2",
            "Wann sollte ich eine Laboruntersuchung auf SARS-CoV-2 veranlassen?",
            "Ich bin mir in viele Fällen unsicher, ob ich eine Laboruntersuchung veranlassen soll oder nicht. Gibt es hierzu klare Handlungsempfehlungen?",
            231,
            answer = "Das RKI hat eine Falldefinition und ein Flussschema erstellt, die umfangreiche Hilfestellung geben, bei welchen Patienten eine Laboruntersuchung auf das neuartige Coronavirus durchgeführt werden sollte.\n" +
                    "\n" +
                    "Eine Laboruntersuchung auf SARS-CoV-2 ist dann angezeigt, wenn es sich bei den Betroffenen um begründete COVID-19-Verdachtsfälle handelt, d.h. sie Krankheitszeichen haben und innerhalb der letzten 14 Tage Kontakt zu einem bestätigten COVID-19-Fall hatten und/oder sich innerhalb der letzten 14 Tage in einem Risikogebiet/einem besonders betroffenen Gebiet in Deutschland aufgehalten haben. Darüber hinaus sollte ein Test auch bei Patienten in Erwägung gezogen werden, die Krankheitszeichen haben und sich in den letzten 14 Tagen in Regionen aufgehalten haben, in denen COVID-19-Fälle vorkommen, die aber noch nicht als Risikogebiete/besonders betroffene Gebiete gelten, sowie generell bei Patienten mit Hinweis auf eine virale Pneumonie ohne Alternativdiagnose. \n" +
                    "\n" +
                    "Tests bei asymptomatischen Personen werden nicht empfohlen."
        ),
        Question(
            "Question3",
            "Wie wird eine Infektion mit SARS-CoV-2 labordiagnostisch nachgewiesen?",
            "Ist der direkte Erregernachweis ausschlaggebend, oder wird die Infektion anderweitig festgestellt?",
            90,
            answer = "Für die Feststellung einer akuten Infektion mit dem SARS-CoV-2 ist der direkte Erregernachweis ausschlaggebend. Das Virusgenom wird über hoch-sensitive, molekulare Testsysteme nachgewiesen (real-time PCR). Die reine Testzeit beträgt etwa 4 bis 5 Stunden. Die Zeit zwischen Probenentnahme und Ergebnismitteilung kann nach ein bis zwei Tagen vorliegen, je nach Probenaufkommen kann die Ergebnismitteilung deutlich länger dauern.\n" +
                    "\n" +
                    "In der frühen Phase sind Abstriche aus den oberen Atemwegen besonders als Probenmaterial geeignet (Rachenabstriche bzw. Nasopharyngealabstriche). In späteren Phasen können außerdem Sekrete aus den unteren Atemwegen (z.B. Sputumproben) zur Untersuchung genutzt werden. Weitere Informationen zur Testung finden Sie hier. Der Nachweis von SARS-CoV-2 im Stuhl kann u.U. auch noch längere Zeit nach Beginn der Symptome erfolgen, sagt aber allein nichts darüber aus, wie ansteckend ein Patient ist.\n" +
                    "\n" +
                    "Zur Ergänzung der molekularen Diagnostik sollte bei schweren Krankheitsverläufen auch eine radiologische/bildgebende Diagnostik erfolgen.\n" +
                    "\n" +
                    "Für Forschungszwecke spielt die Virusanzucht in Zellkultursystemen eine große Rolle. Sie setzt sowohl eine besondere Expertise als auch dafür ausgelegte Labore voraus (in Deutschland ein Labor der Sicherheitsstufe 3).\n" +
                    "\n" +
                    "Ein Test auf SARS-CoV-2 spezifische Antikörper im Blut/Serum kann für epidemiologische Fragestellungen sinnvoll sein. Aktuell sind diese Tests noch in der Entwicklung bzw. Zulassungsphase, sie stehen noch nicht zur Verfügung. Unabhängig davon spielen sie für die Akutdiagnostik keine Rolle, da zwischen Beginn der Symptomatik und der Nachweisbarkeit spezifischer Antikörpern ca. 7 Tage vergehen (in Einzelfällen auch mehr)."
        ),
        Question(
            "Question4",
            "Wie kann ich mit Situation B umgehen?",
            "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et d",
            10
        ),
        Question(
            "Question5",
            "Wie kann ich mit Situation C umgehen?",
            "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et d",
            201
        ),
        Question(
            "Question6",
            "Wie kann ich mit Situation D umgehen?",
            "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et d",
            144
        ),
        Question(
            "Question7",
            "Wie kann ich mit Situation E umgehen?",
            "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et d",
            37
        )
    )
}
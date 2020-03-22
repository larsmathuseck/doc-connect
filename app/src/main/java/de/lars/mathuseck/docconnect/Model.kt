package de.lars.mathuseck.docconnect

import de.lars.mathuseck.docconnect.models.News
import de.lars.mathuseck.docconnect.models.Question

object Model {
    var questions: MutableList<Question> = mutableListOf(
        Question(
            "Question1",
            "Was bringt die Pneumokokken-Impfung in der aktuellen COVID-19-Pandemie?",
            "Viele meiner Patienten fragen nach einer Pneumokokken-Impfung. Gibt diese Impfung einen effektiven Schutz gegen COVID-19?",
            354
        ),
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
            "Question4",
            "Weiß man, wie viele COVID-19-Patienten im Krankenhaus behandelt werden und wie viele genesen sind?",
            "Ich habe an verschiedenen Stellen verschiedene Informationen gelesen. Gibt es hierzu Aussagen von offizieller Seite?",
            10
        ),
        Question(
            "Question2",
            "Wann sollte ich eine Laboruntersuchung auf SARS-CoV-2 veranlassen?",
            "Ich bin mir in viele Fällen unsicher, ob ich eine Laboruntersuchung veranlassen soll oder nicht. Gibt es hierzu klare Handlungsempfehlungen?",
            231
        ),
        Question(
            "Question3",
            "Wie wird eine Infektion mit SARS-CoV-2 labordiagnostisch nachgewiesen?",
            "Ist der direkte Erregernachweis ausschlaggebend, oder wird die Infektion anderweitig festgestellt?",
            90
        )
    )

    var answeredQuestions = mutableListOf(
        Question(
            "Question20",
            "Wann sollte ich eine Laboruntersuchung auf SARS-CoV-2 veranlassen?",
            "Ich bin mir in viele Fällen unsicher, ob ich eine Laboruntersuchung veranlassen soll. Gibt es hierzu klare Handlungsempfehlungen?",
            231,
            answer = "Das RKI hat eine Falldefinition und ein Flussschema erstellt, die umfangreiche Hilfestellung geben, bei welchen Patienten eine Laboruntersuchung auf das neuartige Coronavirus durchgeführt werden sollte.\n" +
                    "\n" +
                    "Eine Laboruntersuchung auf SARS-CoV-2 ist dann angezeigt, wenn es sich bei den Betroffenen um begründete COVID-19-Verdachtsfälle handelt, d.h. sie Krankheitszeichen haben und innerhalb der letzten 14 Tage Kontakt zu einem bestätigten COVID-19-Fall hatten und/oder sich innerhalb der letzten 14 Tage in einem Risikogebiet/einem besonders betroffenen Gebiet in Deutschland aufgehalten haben. Darüber hinaus sollte ein Test auch bei Patienten in Erwägung gezogen werden, die Krankheitszeichen haben und sich in den letzten 14 Tagen in Regionen aufgehalten haben, in denen COVID-19-Fälle vorkommen, die aber noch nicht als Risikogebiete/besonders betroffene Gebiete gelten, sowie generell bei Patienten mit Hinweis auf eine virale Pneumonie ohne Alternativdiagnose. \n" +
                    "\n" +
                    "Tests bei asymptomatischen Personen werden nicht empfohlen.",
            answerAuthor = "Robert Koch Institut",
            answerDate = "21.03.2020, 16:24 Uhr"
        ),
        Question(
            "Question30",
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
                    "Ein Test auf SARS-CoV-2 spezifische Antikörper im Blut/Serum kann für epidemiologische Fragestellungen sinnvoll sein. Aktuell sind diese Tests noch in der Entwicklung bzw. Zulassungsphase, sie stehen noch nicht zur Verfügung. Unabhängig davon spielen sie für die Akutdiagnostik keine Rolle, da zwischen Beginn der Symptomatik und der Nachweisbarkeit spezifischer Antikörpern ca. 7 Tage vergehen (in Einzelfällen auch mehr).",
            answerAuthor = "Bundesministerium für Gesundheit",
            answerDate = "21.03.2020, 15:53 Uhr",
            answerAuthorLogo = R.drawable.bmg_logo
        ),
        Question(
            "Question00",
            "Was ist über COVID-19 bei Kindern und Schwangeren bekannt?",
            "Ich habe von verschiedenen Stellen mitbekommen, dass Kinder und Jugendliche nicht wirklich betroffen sind. Ist das richtig?",
            55,
            answer = "Bisherigen Daten zufolge ist die Symptomatik von COVID-19 bei Kindern deutlich geringer ausgeprägt ist als bei Erwachsenen. Zum tatsächlichen Beitrag von Kindern und Jugendlichen an der Transmission in der Bevölkerung liegen keine Daten vor. Aufgrund der hohen Kontagiosität des Virus und dem engen Kontakt zwischen Kindern und Jugendlichen untereinander erscheint es jedoch plausibel, dass Transmissionen stattfinden.\n" +
                    "\n" +
                    "Schwangere scheinen der WHO und deren Daten aus China zufolge kein erhöhtes Risiko für einen schweren Krankheitsverlauf zu haben. Es gibt bislang keine Hinweise darauf, dass COVID-19 auf das Kind im Mutterleib übertragbar ist. Eine Übertragung auf das neugeborene Kind ist über den engen Kontakt und eine Tröpfcheninfektion möglich, bisher gibt es jedoch keine Nachweise von SARS-CoV-2 in der Muttermilch. Die Datenlage ist derzeit aber noch nicht ausreichend, um diese und andere Fragen zu COVID-19 in der Schwangerschaft sicher zu beantworten.",
            answerAuthor = "Robert Koch Institut",
            answerDate = "21.03.2020, 12:10 Uhr"
        ),
        Question(
            "Question10",
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
                    "         ",
            answerAuthor = "Robert Koch Institut",
            answerDate = "21.03.2020, 11:32 Uhr"
        ),
        Question(
            "Question40",
            "Weiß man, wie viele COVID-19-Patienten im Krankenhaus behandelt werden und wie viele genesen sind?",
            "Ich habe an verschiedenen Stellen verschiedene Informationen gelesen. Gibt es hierzu Aussagen von offizieller Seite?",
            10,
            answer = "Wie viele COVID-19-Fälle aktuell im Krankenhaus behandelt werden, könnte über die Meldedaten erfasst werden. Allerdings wird davon ausgegangen, dass die Daten aktuell nicht immer vollständig vorliegen (siehe \"Wie funktioniert der Meldeweg, was ist alles meldepflichtig und welche Informationen zu den Erkrankten werden ans RKI übermittelt?\") . Neben den Meldedaten können solche Informationen aber auch über andere Surveillancesysteme des RKI erfasst werden, z.B. durch die Krankenhaussurveillance schwerer akuter respiratorischer Infektionen (ICOSARI). Seit 2015 werden am RKI – zur Bewertung der Grippewelle und anderer schwer verlaufender akuter Atemwegserkrankungen – zusätzlich Informationen aus inzwischen rund 70 Sentinelkrankenhäusern ausgewertet und in den Influenza-Wochenberichten veröffentlicht. Genutzt werden dabei insbesondere Entlassungsdiagnosen von Patienten mit Grippe, Lungenentzündungen und anderen akuten Infektionen der unteren Atemwege.\n" +
                    "\n" +
                    "Daten darüber, ob ein Patient wieder genesen ist, werden nicht offiziell erhoben. Die Erhebung ist auch nicht gesetzlich vorgesehen. Das würde die ohnehin knappen Ressourcen des ÖGD unnötigerweise belasten, da sie dafür jeden Fall über Wochen verfolgen müssten und daraus keine weiteren Maßnahmen erfolgen. Allerdings kann man zumindest bei den Fällen, bei denen die meisten Angaben ermittelt wurden und, die keine schweren Symptome hatten, die nicht in ein Krankenhaus eingewiesen wurden, davon ausgehen, dass sie spätestens nach 14 Tagen wieder genesen sind.",
            answerAuthor = "Robert Koch Institut",
            answerDate = "21.03.2020, 11:20 Uhr"
        )
    )

    var news = mutableListOf(
        News(
            "News_1",
            "Robert Koch Institut",
            "21.03.2020, 18:12 Uhr",
            "Internationale Risikogebiete",
            "Internationale Risikogebiete und besonders betroffene Gebiete in Deutschland sind Gebiete, in denen eine fortgesetzte Übertragung von Mensch zu Mensch (\"ongoing community transmission\") vermutet werden kann. Um dies festzulegen, verwendet das Robert Koch-Institut verschiedene Kriterien (u.a. Erkrankungshäufigkeit, Dynamik der täglich gemeldeten Fallzahlen, Maßnahmen (z.B. Quarantäne ganzer Städte oder Gebiete), exportierte Fälle in andere Länder/Regionen). Die Situation wird jeden Tag neu bewertet, bei Bedarf werden die Risikogebiete angepasst.",
            R.drawable.logo_rki
        ),
        News(
            "News_2",
            "Bundesministerium für Gesundheit",
            "21.03.2020, 16:31 Uhr",
            "Steckbrief zur Coronavirus-Krankheit-2019 (COVID-19)",
            "Der Steckbrief zu COVID-19 basiert auf der laufenden Sichtung der wissenschaftlichen Literatur, inklusive der methodischen Bewertung der entsprechenden Quellen. Einige der genannten Literaturstellen sind bisher nur als Vorab-Publikation („preprint“) verfügbar, das heißt, sie wurden zwar schon der (Fach-)Öffentlichkeit zur Verfügung gestellt, aber noch nicht in einem Peer Review-Verfahren begutachtet. Die Datenbasis erweitert sich sehr rasch, daher kann nicht ausgeschlossen werden, dass Publikationen in der aktuellen Version des Steckbriefs noch nicht berücksichtigt wurden.",
            R.drawable.bmg_logo
        ),
        News(
            "News_3",
            "Robert Koch Institut",
            "21.03.2020, 15:53 Uhr",
            "Optionen zum Management von Kontaktpersonen unter medizinischen Personal bei Personalmangel",
            "Die folgenden Hinweise eröffnen Möglichkeiten zur Anpassung vor Ort. Diese Anpassungen sollten möglichst gemeinsam mit dem Gesundheitsamt und unter Berücksichtigung der angestrebten Schutzziele vorgenommen werden.",
            R.drawable.logo_rki
        ),
        News(
            "News_4",
            "Robert Koch Institut",
            "21.03.2020, 15:37 Uhr",
            "Kriterien zur Entlassung aus dem Krankenhaus bzw. aus der häuslichen Isolierung",
            "Im Einzelfall kann in enger Absprache von Klinik, Labor und Gesundheitsamt von diesen Kriterien abgewichen werden, insbesondere bei Beteiligung von Personen, die den Risikogruppen zugerechnet werden (z.B. Immunsupprimierte, ältere Menschen, chronisch Erkrankte).",
            R.drawable.logo_rki
        ),
        News(
            "News_5",
            "Robert Koch Institut",
            "21.03.2020, 15:24 Uhr",
            "Allgemeine Prinzipien der Risikoeinschätzung und Handlungsempfehlung für Veranstaltungen",
            "Veranstaltungen, insbesondere Massenveranstaltungen können dazu beitragen, das Virus schneller zu verbreiten. Daher kannje nach Einzelfall das Absagen, Verschieben oder die Umorganisation von Massenveranstaltungen gerechtfertigt sein, um der vorrangigen Gesundheitssicherheit der Bevölke-rung Rechnung zu tragen.",
            R.drawable.logo_rki
        ),
        News(
            "News_6",
            "Robert Koch Institut",
            "21.03.2020, 15:24 Uhr",
            "Allgemeine Prinzipien der Risikoeinschätzung und Handlungsempfehlung für Veranstaltungen",
            "Veranstaltungen, insbesondere Massenveranstaltungen können dazu beitragen, das Virus schneller zu verbreiten. Daher kannje nach Einzelfall das Absagen, Verschieben oder die Umorganisation von Massenveranstaltungen gerechtfertigt sein, um der vorrangigen Gesundheitssicherheit der Bevölke-rung Rechnung zu tragen.",
            R.drawable.logo_rki
        )
    )
}
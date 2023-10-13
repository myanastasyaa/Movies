package id.myaanastasya.movies.data

import id.myaanastasya.movies.R
import id.myaanastasya.movies.model.Topic

object DataSource {
    val topics = listOf(
        Topic(R.string.got,9.3, R.drawable.gameofthrones),
        Topic(R.string.shawshank,9.3, R.drawable.shawshank),
        Topic(R.string.godfather, 9.2, R.drawable.godfather),
        Topic(R.string.sherlock, 9.1, R.drawable.sherlock),
        Topic(R.string.dark_knight, 9.0, R.drawable.darkknight),
        Topic(R.string.pulp, 8.9, R.drawable.pulpfiction),
        Topic(R.string.schindler, 8.9, R.drawable.schindlerlist),
        Topic(R.string.forrest_gump,8.8, R.drawable.forrest_gump),
        Topic(R.string.inception, 8.8, R.drawable.inception),
        Topic(R.string.matrix,8.7, R.drawable.thematrix),
        Topic(R.string.stranger_things,8.7, R.drawable.strangerthings),
        Topic(R.string.crown, 8.6, R.drawable.thecrown),
        Topic(R.string.parasite, 8.6, R.drawable.parasite),
        Topic(R.string.vikings, 8.5, R.drawable.vikings),
        Topic(R.string.gladiator, 8.5, R.drawable.gladiator),
        Topic(R.string.friends, 8.5, R.drawable.friends),
        Topic(R.string.spartacus, 8.5, R.drawable.spartacus),
        Topic(R.string.joker, 8.2, R.drawable.joker),
        Topic(R.string.witcher, 8.2, R.drawable.thewitcher),
        Topic(R.string.titanic, 7.8, R.drawable.titanic)
    )
}
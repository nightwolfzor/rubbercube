package com.bokland.rubbercube.measure

import com.bokland.rubbercube.Aggregation

/**
 * Created by remeniuk on 4/29/14.
 */
trait AggregationQueryBuilder[QueryType] {

  def buildAggregationQuery(measure: Measure): QueryType

  def buildAggregationQuery(measures: Seq[Measure], aggregations: Seq[Aggregation]): QueryType

}

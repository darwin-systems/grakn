/*
 * Copyright (C) 2021 Grakn Labs
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 */

package grakn.core.traversal.procedure;

import grakn.core.common.iterator.ResourceIterator;
import grakn.core.concurrent.producer.Producer;
import grakn.core.graph.GraphManager;
import grakn.core.traversal.Traversal;
import grakn.core.traversal.common.Identifier;
import grakn.core.traversal.common.VertexMap;

import java.util.List;

public interface Procedure {

    Producer<VertexMap> producer(GraphManager graphMgr, Traversal.Parameters params,
                                 List<Identifier.Variable.Name> filter, int parallelisation);

    ResourceIterator<VertexMap> iterator(GraphManager graphMgr, Traversal.Parameters params,
                                         List<Identifier.Variable.Name> filter);
}
FROM solr:8.11

ENV SOLR_CONFIG ./etc/solr
ENV PROPERTIES ./docker/solr/properties
ENV SOLR_PATH /var/solr/data

COPY --chown=solr:solr ${PROPERTIES}/core.properties ${SOLR_PATH}/ourportfolios_item/core.properties
COPY --chown=solr:solr ${PROPERTIES}/core.properties ${SOLR_PATH}/ourportfolios_trend/core.properties
COPY --chown=solr:solr ${PROPERTIES}/core.properties ${SOLR_PATH}/ourportfolios_suggest/core.properties

RUN sed -i -e "1i name=ourportfolios_item" ${SOLR_PATH}/ourportfolios_item/core.properties && \
    sed -i -e "1i name=ourportfolios_trend" ${SOLR_PATH}/ourportfolios_trend/core.properties && \
    sed -i -e "1i name=ourportfolios_suggest" ${SOLR_PATH}/ourportfolios_suggest/core.properties

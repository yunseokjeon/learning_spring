```bash
$ docker run -p 5432:5432 -e POSTGRES_PASSWORD=pass -e POSTGRES_USER=keesun -e POSTGRES_DB=springdata --name postgres_boot -d postgres
$ docker exec -i -t postgres_boot bash
# su - postgres

```
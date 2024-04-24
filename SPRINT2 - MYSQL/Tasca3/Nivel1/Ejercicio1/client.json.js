db.createCollection('Cliente', {
  validator: {
    $jsonSchema: {
      bsonType: 'object',
      title: 'Cliente',
      properties: {
        name: {
          bsonType: 'string'
        },
        address: {
          bsonType: 'object',
          title: 'object',
          properties: {
            name: {
              bsonType: 'string'
            },
            number: {
              bsonType: 'int'
            },
            flat: {
              bsonType: 'int'
            },
            door: {
              bsonType: 'string'
            },
            city: {
              bsonType: 'string'
            },
            zip_code: {
              bsonType: 'string'
            },
            country: {
              bsonType: 'string'
            }
          }
        },
        phone: {
          bsonType: 'int'
        },
        mail: {
          bsonType: 'string'
        },
        register_date: {
          bsonType: 'date'
        },
        referral: {
          bsonType: 'int'
        },
        Sale: {
          bsonType: 'object',
          title: 'object',
          properties: {
            id_sale: {
              bsonType: 'int'
            },
            date: {
              bsonType: 'date'
            },
            glasses: {
              bsonType: 'object',
              title: 'object',
              properties: {
                brand: {
                  bsonType: 'string'
                },
                graduation: {
                  bsonType: 'object',
                  title: 'object',
                  properties: {
                    left: {
                      bsonType: 'string'
                    },
                    right: {
                      bsonType: 'string'
                    }
                  }
                },
                color: {
                  bsonType: 'object',
                  title: 'object',
                  properties: {
                    left: {
                      bsonType: 'string'
                    },
                    right: {
                      bsonType: 'string'
                    }
                  }
                },
                frame_type: {
                  enum: metal,
                  pasta,
                  float
                },
                price: {
                  bsonType: 'double'
                }
              }
            }
          }
        }
      }
    }
  }
});